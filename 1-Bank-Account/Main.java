import java.util.*;

class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    static int totalAccounts = 0;
    static String bankName = "Utkarsh Bank";

    BankAccount(String accountHolder, double balance) {
        this.accountNumber=++totalAccounts;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    void deposit(double amount) {
        if(amount>0)
        balance+=amount;
    }

    void withdraw(double amount) {
        if(amount>0 && balance>amount)
        balance-=amount;
    }

    static int getTotalAccounts() {
        return totalAccounts;
    }

    void displayDetails() {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.printf("Balance: %.1f",balance);
        System.out.println();
    }

    int getAccountNumber() {
        return accountNumber;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BankAccount[] accounts = new BankAccount[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            double balance = sc.nextDouble();
            accounts[i] = new BankAccount(name, balance);
        }
        int transactions = sc.nextInt();
        for (int i = 0; i < transactions; i++) {
            int accountNumber = sc.nextInt();
            String operation = sc.next();
            double amount = sc.nextDouble();
            for (BankAccount account : accounts) {
                if (account.getAccountNumber() == accountNumber) {
                    if (operation.equals("DEPOSIT")) {
                        account.deposit(amount);
                    }
                    else if (operation.equals("WITHDRAW")) {
                        account.withdraw(amount);
                    }
                    break;
                }
            }
        }
        for (BankAccount account : accounts) {
            account.displayDetails();
        }

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

        sc.close();
    }
}
