package employee;

public class EmployeeManager {
    private Employee[] employees;
    private int count;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }


    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            System.out.println("Added: " + emp);
        } else {
            System.out.println("Employee array is full!");
        }
    }


    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == id) {
                return employees[i];
            }
        }
        return null;
    }


    public void displayEmployees() {
        System.out.println("\n--- Employee List ---");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }


    public void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == id) {
                // Shift elements
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;  // Remove reference
                System.out.println("Deleted employee with ID " + id);
                return;
            }
        }
        System.out.println("Employee ID not found.");
    }
}
