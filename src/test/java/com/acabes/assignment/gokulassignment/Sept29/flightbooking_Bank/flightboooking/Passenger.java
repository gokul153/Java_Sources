package com.acabes.assignment.gokulassignment.Sept29.flightbooking_Bank.flightboooking;


class Passenger implements BookingSystem {
    String passengerName;
    Passenger(String passengerName){
        this.passengerName=passengerName;
    }
    public void  bookFlight(){
        System.out.println("Booking Flights");
    }
    public void  cancelFlight(){
        System.out.println("Trying to cancel Flights");
    }
    public void displaySeatAvailability(){
        System.out.println("Displaying Seat Availability");
    }
}