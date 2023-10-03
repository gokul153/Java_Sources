package com.acabes.assignment.gokulassignment.Sept29.bankaccount;



class BankAccount {
    double accountNumber;
    String accountHolder;
    float balance;

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    void deposit(float amount) {
        try {
            if (amount < 0) {
                throw new InvalidAmount();
                //  System.out.println("Amount Should be greater than zero");
            } else {
                balance = balance + amount;
            }
        } catch (InvalidAmount e) {
            System.out.println("invalid amount Exeption");
            e.getdetail();
            e.printBuisnessError();

        }

    }
    void withdraw(float amount) {
        if (amount > balance) {
            System.out.println("Amount Insufficient");
        } else {
            balance = balance - amount;
        }
        System.out.println("Balance is:" + balance);
        System.out.println("Amount is" + amount);
    }
}