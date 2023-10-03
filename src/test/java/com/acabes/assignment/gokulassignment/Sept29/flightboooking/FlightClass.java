package com.acabes.assignment.gokulassignment.Sept29.flightboooking;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class FlightClass extends Passenger {

    int flightNumber;
    Map<Integer,Integer> flightMap =new HashMap<>();

    ArrayList<Integer> seats= new ArrayList<Integer>();
    ArrayList<Integer> seatalignment= new ArrayList<Integer>();
    FlightClass(int flightNumber,int seats,String passengerName){
        super(passengerName);
        flightMap.put(flightNumber,seats);
        for(int i=0;i<seats;i++) {
            this.seatalignment.add(i,1);
        }
    }
    public void cancelParticularSeat(int seatno,int flightNumber){
        try{
            if (seatalignment.get(seatno) != 0) {
                throw new NoSeatException();
                //   System.out.println("Seat Number:"+seatno+" is not booked kindly check the seat");

            } else {
                System.out.println("Seat no" + seatno + " is booked");
                System.out.println("Cancelled "+seatno);
            }

        }
        catch (NoSeatException e){
            e.printBuisnessError();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Enter a seat within limit");
            System.out.println(e);

        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Enter a seat which is booked");
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
                if (flightMap.get(flightNumber) > number_Of_Seat) {
                    int existing = flightMap.get(flightNumber) - number_Of_Seat;
                    flightMap.put(flightNumber, existing);
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
        int existing=flightMap.get(flightNumber);
        System.out.println(existing);
    }
    public void cancelSeat(int number_Of_Seat,int flightNumber){
        cancelFlight();
        if(number_Of_Seat>0){
            Scanner sc=new Scanner(System.in);

            int existing=flightMap.get(flightNumber)+number_Of_Seat;

            int j=0;
            do {
                System.out.println("Enter the seat  no :"+j+"th seat");
                int seatno = sc.nextInt();
                cancelParticularSeat(seatno,flightNumber);
                j++;
            }while (j<number_Of_Seat);
          //  System.out.println((number_Of_Seat-j)+"Seat not_ canceled due to invalid seat no" );
           // existing=(existing-(number_Of_Seat-j));
            flightMap.put(flightNumber,existing);
            System.out.println("Cancel Successfull!");


        }
        else{
            System.out.println("Enter a value Greater than zero");
        }
    }
}