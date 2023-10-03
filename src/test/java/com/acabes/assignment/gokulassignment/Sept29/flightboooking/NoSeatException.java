package com.acabes.assignment.gokulassignment.Sept29.flightboooking;

class NoSeatException extends Exception{
    int errorCode=999;
    String category="No Seat";
    String message="Check Seat Number";
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
