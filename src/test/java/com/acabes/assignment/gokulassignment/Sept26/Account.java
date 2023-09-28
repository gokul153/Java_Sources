package com.acabes.assignment.gokulassignment.Sept26;

import java.io.Serial;
import java.util.Scanner;


public class Account {                                  /*Main_Account_Class*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputcheck;

        do {
            System.out.println("Enter the type of Account s for Savings , C for checking Account");
            CheckingAccount ch = new CheckingAccount();

            SavingsAccount sv = new SavingsAccount();

            char input = scanner.next().charAt(0);
            if (input == 'S' || input == 's') {
                System.out.println("Saving Account");
                System.out.println("Enter Account Holder name");
                String accountHolder = scanner.nextLine();
                scanner.nextLine();
                sv.setAccountHolder(accountHolder);
                System.out.println("Enter Balance");
                float balance = scanner.nextFloat();
                sv.setBalance(balance);
                System.out.println("Enter Amount to be deposited");
                float deposit = scanner.nextFloat();
                sv.deposit(deposit);
                balance = sv.getBalance();
                System.out.println("Remaining Balancw is" + balance);
                System.out.println("If you like to withdraw press w");
                char withdraw_check;
                withdraw_check = scanner.next().charAt(0);
                if (withdraw_check == 'w') {
                    System.out.println("Enter the amount");
                    float amount = scanner.nextInt();
                    sv.withdraw(amount);
                }
                System.out.println("Interest Applied at END");
                sv.applyintrest();


            }
            if (input == 'C' || input == 'c') {
                System.out.println("checking  Account");
                System.out.println("Enter Account Holder name");
                String accountHolder = scanner.nextLine();
                scanner.nextLine();
                ch.setAccountHolder(accountHolder);
                System.out.println("Enter Balance");
                float balance = scanner.nextFloat();
                ch.setBalance(balance);
                System.out.println("Enter Amount to be deposited");
                float deposit = scanner.nextFloat();
                ch.deposit(deposit);
                balance = ch.getBalance();
                System.out.println("Remaing Balancw is" + balance);



            }
            System.out.println("If you like to withdraw press w");
            char withdraw_check;
            withdraw_check = scanner.next().charAt(0);

            if (withdraw_check == 'w') {
                System.out.println("Enter the amount");
                float amount = scanner.nextInt();

                ch.withdraw(amount);
            }


            System.out.println("Enter q to exit or any other letter to continue");
            inputcheck = scanner.next().charAt(0);

        }
        while (inputcheck != 'q');                                      ///while_condition check
    }

}

