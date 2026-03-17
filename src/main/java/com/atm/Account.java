package com.atm.model;

public class Account {

    private int accountId;
    private String name;
    private int pin;
    private double balance;

    public Account(int accountId, String name, int pin, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
