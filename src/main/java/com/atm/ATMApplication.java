package com.atm.main;

import com.atm.model.Account;
import com.atm.service.ATMService;

import java.util.Scanner;

public class ATMApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account = new Account(1,"Amit",1234,10000);

        ATMService atmService = new ATMService();

        while(true) {

            System.out.println("1 Deposit");
            System.out.println("2 Withdraw");
            System.out.println("3 Check Balance");
            System.out.println("4 Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Enter amount:");
                    int dep = sc.nextInt();
                    atmService.deposit(account, dep);
                    break;

                case 2:
                    System.out.println("Enter amount:");
                    int wd = sc.nextInt();
                    atmService.withdraw(account, wd);
                    break;

                case 3:
                    atmService.checkBalance(account);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}