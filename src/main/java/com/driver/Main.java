package com.driver;

public class Main {
    public static void main(String[] args) {
        try {
        BankAccount account1 = new BankAccount("John Doe", 1000, 500);
        System.out.println("Account 1 created with account number: " + BankAccount.generateAccountNumber(10, 50));
        account1.deposit(500);
        account1.withdraw(200);
        System.out.println("Account 1 balance: " + account1.balance);

        CurrentAccount account2 = new CurrentAccount("Jane Doe", 5000, "TRADE1234");
        System.out.println("Account 2 created with account number: " + BankAccount.generateAccountNumber(10, 50));
        account2.validateLicenseId();
        account2.deposit(1000);
        account2.withdraw(2000);
        System.out.println("Account 2 balance: " + account2.balance);

        SavingsAccount account3 = new SavingsAccount("Bob Smith", 500, 0.05, 100);
        System.out.println("Account 3 created with account number: " + BankAccount.generateAccountNumber(10, 50));
        account3.deposit(1000);
        account3.withdraw(50);
        System.out.println("Account 3 balance: " + account3.balance);
        System.out.println("Account 3 simple interest after 2 years: " + account3.getSimpleInterest(2));
        System.out.println("Account 3 compound interest after 2 years: " + account3.getCompoundInterest(2, 2));

        StudentAccount account4 = new StudentAccount("Alice Johnson", 100, "XYZ University");
        System.out.println("Account 4 created with account number: " + BankAccount.generateAccountNumber(10, 50));
        account4.deposit(500);
        account4.withdraw(50);
        System.out.println("Account 4 balance: " + account4.balance);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
}
