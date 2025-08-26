package dsa.exceptionhandling;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String str) {
        super(str);
    }
}

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            try {
                throw new InsufficientFundsException("Insuffient Funds..!");
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        } else {
            balance -= amount;
            System.out.println("Withdraw the amount:" + amount);
            System.out.println("Remaining Balence" + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(5000);
        System.out.println("Enter the Amount to Withdraw");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println("Balence..!"+bankAccount.balance);
        bankAccount.withdraw(amount);
    }
}
