package Services;

import Dao.AccountDAO;
import Dao.TransactionDAO;
import Models.Account;
import Models.Transaction;


import java.sql.Timestamp;
import java.util.Scanner;

public class AllServices {
    private static Scanner scanner = new Scanner(System.in);
    private static AccountDAO accountDAO = new AccountDAO();
    private static TransactionDAO transactionDAO = new TransactionDAO();

    public static void createAccount() {
        System.out.print("Enter account holder name: ");
        scanner.nextLine(); // Consume newline
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        Account account = new Account(0, accountHolderName, balance);
        accountDAO.createAccount(account);
        System.out.println("Account created successfully.");
    }

    public static void viewAccount() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        Account account = accountDAO.getAccountById(accountNumber);
        if (account != null) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder Name: " + account.getAccountHolderName());
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void updateAccount() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new account holder name: ");
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter new balance: ");
        double balance = scanner.nextDouble();
        Account account = new Account(accountNumber, accountHolderName, balance);
        accountDAO.updateAccount(account);
        System.out.println("Account updated successfully.");
    }

    public static void closeAccount() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        accountDAO.deleteAccount(accountNumber);
        System.out.println("Account closed successfully.");
    }

    public static void depositFunds() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        Account account = accountDAO.getAccountById(accountNumber);
        if (account != null) {
            account.setBalance(account.getBalance() + amount);
            accountDAO.updateAccount(account);
            Transaction transaction = new Transaction(0, accountNumber, "Deposit", amount, new Timestamp(System.currentTimeMillis()));
            transactionDAO.createTransaction(transaction);
            System.out.println("Funds deposited successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void withdrawFunds() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        Account account = accountDAO.getAccountById(accountNumber);
        if (account != null) {
            if (account.getBalance() >= amount) {
                account.setBalance(account.getBalance() - amount);
                accountDAO.updateAccount(account);
                Transaction transaction = new Transaction(0, accountNumber, "Withdrawal", amount, new Timestamp(System.currentTimeMillis()));
                transactionDAO.createTransaction(transaction);
                System.out.println("Funds withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void transferFunds() {
        System.out.print("Enter source account number: ");
        int sourceAccountNumber = scanner.nextInt();
        System.out.print("Enter destination account number: ");
        int destinationAccountNumber = scanner.nextInt();
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        Account sourceAccount = accountDAO.getAccountById(sourceAccountNumber);
        Account destinationAccount = accountDAO.getAccountById(destinationAccountNumber);
        if (sourceAccount != null && destinationAccount != null) {
            if (sourceAccount.getBalance() >= amount) {
                sourceAccount.setBalance(sourceAccount.getBalance() - amount);
                destinationAccount.setBalance(destinationAccount.getBalance() + amount);
                accountDAO.updateAccount(sourceAccount);
                accountDAO.updateAccount(destinationAccount);
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                Transaction sourceTransaction = new Transaction(0, sourceAccountNumber, "Transfer", amount, timestamp);
                Transaction destinationTransaction = new Transaction(0, destinationAccountNumber, "Transfer", amount, timestamp);
                transactionDAO.createTransaction(sourceTransaction);
                transactionDAO.createTransaction(destinationTransaction);
                System.out.println("Funds transferred successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account(s) not found.");
        }
    }
}
