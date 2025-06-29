
BEGIN
    EXECUTE IMMEDIATE 'DROP PROCEDURE ProcessMonthlyInterest';
EXCEPTION WHEN OTHERS THEN NULL;
END;
/

BEGIN
    EXECUTE IMMEDIATE 'DROP PROCEDURE UpdateEmployeeBonus';
EXCEPTION WHEN OTHERS THEN NULL;
END;
/

BEGIN
    EXECUTE IMMEDIATE 'DROP PROCEDURE TransferFunds';
EXCEPTION WHEN OTHERS THEN NULL;
END;
/

SET SERVEROUTPUT ON;

DELETE FROM Accounts;
DELETE FROM Employees;

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (1, 1, 'Savings', 12000, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (2, 2, 'Checking', 8500, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (3, 2, 'Checking', 3000, SYSDATE);

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (1, 'Alice Johnson', 'Manager', 70000, 'HR', TO_DATE('2015-06-15', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (2, 'Bob Brown', 'Developer', 60000, 'IT', TO_DATE('2017-03-20', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (3, 'Charlie White', 'Tester', 55000, 'IT', TO_DATE('2018-09-01', 'YYYY-MM-DD'));

COMMIT;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01),
        LastModified = SYSDATE
    WHERE AccountType = 'Savings';
    COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    deptName IN VARCHAR2,
    bonusPercent IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonusPercent / 100)
    WHERE Department = deptName;
    COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE TransferFunds(
    fromAccountID IN NUMBER,
    toAccountID IN NUMBER,
    amount IN NUMBER
) IS
    fromBalance NUMBER;
BEGIN
    SELECT Balance INTO fromBalance
    FROM Accounts
    WHERE AccountID = fromAccountID
    FOR UPDATE;

    IF fromBalance < amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds.');
    END IF;

    UPDATE Accounts
    SET Balance = Balance - amount,
        LastModified = SYSDATE
    WHERE AccountID = fromAccountID;

    UPDATE Accounts
    SET Balance = Balance + amount,
        LastModified = SYSDATE
    WHERE AccountID = toAccountID;

    COMMIT;
END;
/
BEGIN
    ProcessMonthlyInterest;
    UpdateEmployeeBonus('IT', 10); 
    TransferFunds(3, 2, 500);      
END;
/

BEGIN
    DBMS_OUTPUT.PUT_LINE('ACCOUNTID  CUSTOMERID  ACCOUNTTYPE   BALANCE   LASTMODIFIED');
    DBMS_OUTPUT.PUT_LINE('---------  ----------  ------------  -------   ------------');

    FOR rec IN (
        SELECT AccountID, CustomerID, RPAD(AccountType, 12) AS AccountType,
               TO_CHAR(Balance, '99999999') AS Balance,
               TO_CHAR(LastModified, 'DD-MM-YY') AS LastMod
        FROM Accounts
        ORDER BY AccountID
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            LPAD(rec.AccountID, 9) || '  ' ||
            LPAD(rec.CustomerID, 10) || '  ' ||
            RPAD(rec.AccountType, 12) || '  ' ||
            LPAD(rec.Balance, 7) || '   ' ||
            rec.LastMod
        );
    END LOOP;
END;
/

BEGIN
    DBMS_OUTPUT.PUT_LINE(CHR(10) || 'EMPLOYEEID  NAME               POSITION     SALARY   DEPARTMENT');
    DBMS_OUTPUT.PUT_LINE('----------  ------------------  -----------  -------  ----------');

    FOR emp IN (
        SELECT EmployeeID, RPAD(Name, 18) AS Name,
               RPAD(Position, 11) AS Position,
               TO_CHAR(Salary, '999999') AS Salary,
               RPAD(Department, 10) AS Dept
        FROM Employees
        ORDER BY EmployeeID
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            LPAD(emp.EmployeeID, 10) || '  ' ||
            emp.Name || '  ' ||
            emp.Position || '  ' ||
            LPAD(emp.Salary, 7) || '  ' ||
            emp.Dept
        );
    END LOOP;
END;
/
