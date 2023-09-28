package com.acabes.assignment.gokulassignment.Sept26;

class CheckingAccount extends BankAccount {
    float overdraftFee;

    void withdraw(float amount) {
        try{
            if(amount<0){
                throw new InvalidAmount();
                       }
            float overdraftFee = 55;
            float balance = getBalance();
            float surplus = balance - amount;

            if (surplus < 0) {                                                      //overdraft_balance_check
                System.out.println("Over Draft amount reduced");
                balance = balance - overdraftFee;
                            }
            setBalance(balance);
            System.out.println("CheckingAccount Balance is:" + balance);
            System.out.println("CheckingAccount Amount is" + amount);
        }catch (InvalidAmount e){
            System.out.println("Invalid Amount Exception");
            e.printBuisnessError();
                                }

                             }
}