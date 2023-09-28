package com.acabes.assignment.gokulassignment.Sept26;

class SavingsAccount extends BankAccount {
    float interest_rate;

    void withdraw(float amount) {
        float balance = super.getBalance();
        System.out.println("Intial balance is" + balance);
        try{
            if(amount<0){
                throw new InvalidAmount();
            }
            try {

                if (balance < 100) {
                    System.out.println("Amount should be grater than 100");
                }
                if (amount > balance) {
                    System.out.println("Amount Insufficient ");
                    throw new InsuffientBalance();

                } else {
                    balance = balance - amount;
                }
                System.out.println("SavingsAccount Balance is:" + balance);

            } catch (InsuffientBalance e) {
                e.getdetail();
                e.printBuisnessError();
            }
        }catch (InvalidAmount e){
            e.printBuisnessError();

        }


                          }
    void applyintrest() {
        balance = 3 / 100 * balance + balance;
        setBalance(balance);
                        }
}