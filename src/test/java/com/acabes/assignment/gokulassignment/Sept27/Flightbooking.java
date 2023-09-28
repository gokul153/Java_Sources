package com.acabes.assignment.gokulassignment.Sept27;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ServiceConfigurationError;

interface BookingSystem{
    void bookFlight();
    void cancelFlight();
    void displaySeatAvailability();
}
class Passenger implements  BookingSystem{
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
class FlightClass extends Passenger{
    int flightNumber;
    ArrayList<Integer> seats= new ArrayList<Integer>();
    ArrayList<Integer> seatalignment= new ArrayList<Integer>();
    FlightClass(int flightNumber,int seats){
        this.flightNumber=flightNumber;
        this.seats.add(flightNumber,seats);
        for(int i=0;i<seats;i++) {
            this.seatalignment.add(i,1);
        }
    }
    public void cancelParticularSeat(int seatno,int flightNumber){
        try{
            if (seatalignment.get(seatno) != 0) {
                System.out.println("Seat Number:"+seatno+" is not booked kindly check the seat");

            } else {
                System.out.println("Seat no" + seatno + " is booked");
                System.out.println("Cancelled "+seatno);
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Enter a seat within limit");
            System.out.println(e);

        }
    }
  public void bookparticularseat(int seatno,int flightNumber){
        try{
      if (seatalignment.get(seatno) == 1) {
          System.out.println("Seat AVailable at seat no" + seatno);
          seatalignment.set(seatno,0);

      } else {
          System.out.println("Seat no" + seatno + " already booked by someone else");
      }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Enter a number less than that of seat limit");
            System.out.println(e);
        }
  }
    public void bookSeat(int number_Of_Seat,int flightNumber){
        bookFlight();
        Scanner sc=new Scanner(System.in);
        if(number_Of_Seat>0) {
            try {
                if (seats.get(flightNumber) > number_Of_Seat) {
                    int existing = seats.get(flightNumber) - number_Of_Seat;
                    seats.add(flightNumber, existing);
                    int j = 0;
                    do {
                        System.out.println("Enter the seat  no :" + j + "th seat");
                        int seatno = sc.nextInt();
                        bookparticularseat(seatno, flightNumber);
                        j++;
                    } while (j < number_Of_Seat);

                    System.out.println("Booking Successfull!");
                } else {
                    System.out.println("Insufficient Seat!");
                }

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Enter Flight no is seqentioal order");
                System.out.println(e);
        }
        }

    }
    public void getseat(int flightNumber){
        System.out.println("Remaining Seats to be booked");
        int existing=seats.get(flightNumber);
        System.out.println(existing);
    }
    public void cancelSeat(int number_Of_Seat,int flightNumber){
        cancelFlight();
        if(number_Of_Seat>0){
            Scanner sc=new Scanner(System.in);
            int existing=seats.get(flightNumber)+number_Of_Seat;
            seats.add(flightNumber,existing);
            int j=0;
            do {
                System.out.println("Enter the seat  no :"+j+"th seat");
                int seatno = sc.nextInt();
                cancelParticularSeat(seatno,flightNumber);
                j++;
            }while (j<number_Of_Seat);
            System.out.println("Cancel Successfull!");


        }
        else{
            System.out.println("Enter a value Greater than zero");
        }
    }
}
public class Flightbooking {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      char input_intial1='a';
      int token=0;
      do {

          int flight_number = token;
          System.out.println("Flight number is"+flight_number);
          System.out.println("Enter the number of seats");
          int seat = sc.nextInt();
          System.out.println("Current Flight no is" + flight_number);
          FlightClass ft = new FlightClass(0, seat);

          System.out.println("Enter the number of seats to be booked");
          int no_of_seat= sc.nextInt();
          System.out.println("flightnumber is"+flight_number);

          ft.bookSeat(no_of_seat,flight_number);
          System.out.println("Remaining Seat");
          ft.getseat(flight_number);
          System.out.println("Do want to cancel the ticket press c");
           char input = sc.next().charAt(0);
           if(input=='c'){
               System.out.println("Enter the no of seat to be canceled");
               int cancel_seat= sc.nextInt();
               ft.cancelSeat(cancel_seat,flight_number);
               System.out.println("Remaining Seat");
               ft.getseat(flight_number);
           }
          System.out.println("Enter q to quit ");
          input_intial1= sc.next().charAt(0);
          token++;
      }while (input_intial1!='q');



  }
}
