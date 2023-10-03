package com.acabes.assignment.gokulassignment.Sept29.bankaccount;

public class InsuffientBalance extends  Exception{
    int errorCode=985;
    String category="Balance";
    String message="Check your balance";
    void getdetail(){
        System.out.println(errorCode);
        System.out.println(message);
    }
    void printBuisnessError(){
        System.out.println("Category"+category);
        System.out.println("Message:"+message);
        System.out.println("Error Code:"+errorCode);
    }
    public int getErrorCode() {
        return this.errorCode;
    }
}
class InvalidAmount extends Exception{
    int errorCode=565;
    String category="Deposit";
    String message="Amount should be greater than zero";
    void getdetail(){
        System.out.println(errorCode);
    }
    public int getErrorCode(){
        return  this.errorCode;
    }
    void printBuisnessError(){
        System.out.println("Category"+category);
        System.out.println("Message:"+message);
        System.out.println("Error Code:"+errorCode);
    }
}
