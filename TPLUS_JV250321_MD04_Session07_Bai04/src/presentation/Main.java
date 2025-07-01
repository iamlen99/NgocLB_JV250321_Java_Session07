package presentation;

import entity.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount accountA = new BankAccount("A001", "Nguyen Van A", "0123456789");
        BankAccount accountB = new BankAccount("B001", "Nguyen Van B", "0987654321");

        accountA.deposit(1000);

        double transferAmount = 300;
        accountA.withdraw(transferAmount);
        accountB.deposit(transferAmount);

        accountA.displayBalance();
        accountB.displayBalance();
    }
}
