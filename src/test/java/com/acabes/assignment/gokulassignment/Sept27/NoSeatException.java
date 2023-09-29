package com.acabes.assignment.gokulassignment.Sept27;

class NoSeatException extends Exception{
    int errorCode=999;
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
}
