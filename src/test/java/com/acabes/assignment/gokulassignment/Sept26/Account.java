package com.acabes.assignment.gokulassignment.Sept26;

import java.util.Scanner;

class BankAccount
{
    double accountNumber;
    String accountHolder;
    float balance;
    public  double getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(double accountNumber){
        this.accountNumber=accountNumber;
    }
    public  String getHolder(){
        return accountHolder;
    }
    public void  setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    public float getBalance(){
        return balance;
    }
    public  void setBalance(float balance){
        this.balance=balance;
    }
    void deposit(float amount){
         if(amount<0){
             System.out.println("Amount Should be greater than zero");
         }
         else{
             balance=balance+amount;
         }
    }
    void  withdraw(float amount){
        if(amount>balance){
             System.out.println("Amount Insufficient");
        }else {
            balance=balance-amount;
        }
        System.out.println("Balance is:"+balance);
        System.out.println("Amount is"+amount);
    }

}
class SavingsAccount extends BankAccount{
    float interest_rate;
    void withdraw(float amount){
        float balance= super.getBalance();
        if(amount>balance&&balance>100){
            System.out.println("Amount Insufficient and balance should be greater than $100");
        }else {
            balance=balance-amount;
        }
        System.out.println("SavingsAccount Balance is:"+balance);
        System.out.println("SavingsAccount Amount is"+amount);
    }
    void  applyintrest(){
        balance=3/100*balance+balance;
        setBalance(balance);
    }
}
class CheckingAccount extends  BankAccount{
    float overdraftFee;
    void withdraw(float amount){
        float overdraftFee=55;
        float balance= getBalance();
        float surplus=balance-amount;
        if(surplus<0){
            balance=balance-overdraftFee;
        }
        setBalance(balance);
        System.out.println("CheckingAccount Balance is:"+balance);
        System.out.println("CheckingAccount Amount is"+amount);
    }
}
public class Account {
    public  static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        char inputcheck;

            do {
                System.out.println("Enter the type of Account s for Savings , C for checking Account");
                CheckingAccount ch = new CheckingAccount();

                SavingsAccount sv = new SavingsAccount();

                char input = scanner.next().charAt(0);
                if (input == 'S' || input == 's') {
                    System.out.println("Saving Account");
                    System.out.println("Enter Account Holde name");
                    String accountHolder = scanner.nextLine();
                    scanner.nextLine();
                    sv.setAccountHolder(accountHolder);
                    System.out.println("Enter Balance");
                    float balance = scanner.nextFloat();
                    sv.setBalance(balance);
                    System.out.println("Enter Amount to be deposited");
                    float deposit = scanner.nextFloat();
                    sv.deposit(deposit);
                    balance=sv.getBalance();
                    System.out.println("Remaing Balancw is"+balance);
                    System.out.println("If you like to withdraw press w");
                    char withdraw_check;
                    withdraw_check=scanner.next().charAt(0);
                    if(withdraw_check=='w'){
                        System.out.println("Enter the amount");
                        float amount= scanner.nextInt();
                        sv.withdraw(amount);
                    }
                    System.out.println("Calculate Interest");
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
                    balance=ch.getBalance();
                    System.out.println("Remaing Balancw is"+balance);
                    System.out.println("Calculate Interest");


                }
                System.out.println("If you like to withdraw press w");
                char withdraw_check;
                withdraw_check=scanner.next().charAt(0);

                if(withdraw_check=='w'){
                    System.out.println("Enter the amount");
                    float amount= scanner.nextInt();
                    ch.withdraw(amount);
                }



                    System.out.println("Enter q to exit or any other letter to continue");
                    inputcheck = scanner.next().charAt(0);

                }
                while(inputcheck != 'q') ;
            }

    }

