package entity;

public class BankAccount implements IBank {
    private String accountId;
    private double balance;
    private String userName;
    private String phoneNumber;

    public BankAccount(String accountId, String userName, String phoneNumber) {
        this.accountId = accountId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Da nhan tien: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Da rut tien: " + amount);
    }

    public void displayBalance() {
        System.out.println("So du tai khoan (" + this.accountId + "): " + this.balance);
    }
}
