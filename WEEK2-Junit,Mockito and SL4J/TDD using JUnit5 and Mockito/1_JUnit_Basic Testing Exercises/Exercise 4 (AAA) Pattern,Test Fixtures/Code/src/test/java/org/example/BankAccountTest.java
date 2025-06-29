package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    // Setup (Before Each Test)
    @Before
    public void setUp() {
        account = new BankAccount("Alice", 1000);
        System.out.println("Setup: Created new account with balance 1000");
    }

    // Teardown (After Each Test)
    @After
    public void tearDown() {
        account = null;
        System.out.println("Teardown: Cleared account");
    }

    // Test using Arrange-Act-Assert pattern
    @Test
    public void testDeposit() {
        // Arrange
        int depositAmount = 500;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(1500, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        // Arrange
        int withdrawAmount = 300;

        // Act
        account.withdraw(withdrawAmount);

        // Assert
        assertEquals(700, account.getBalance());
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        // Arrange
        int withdrawAmount = 2000;

        // Act
        account.withdraw(withdrawAmount);

        // Assert
        assertEquals("Balance should remain unchanged", 1000, account.getBalance());
    }

    @Test
    public void testAccountHolderName() {
        // Arrange + Act are already done in setup

        // Assert
        assertEquals("Alice", account.getAccountHolder());
    }
}
