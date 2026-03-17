package com.atm.service;

import com.atm.model.Account;

public class ATMService {

    public void deposit(Account account, double amount) {

        account.deposit(amount);

        System.out.println("Deposit successful");
        System.out.println("New balance: " + account.getBalance());
    }

    public void withdraw(Account account, double amount) {

        if(amount > account.getBalance()) {
            System.out.println("Insufficient balance");
            return;
        }

        account.withdraw(amount);

        System.out.println("Withdraw successful");
        System.out.println("Remaining balance: " + account.getBalance());
    }

    public void checkBalance(Account account) {

        System.out.println("Balance: " + account.getBalance());
    }
}
