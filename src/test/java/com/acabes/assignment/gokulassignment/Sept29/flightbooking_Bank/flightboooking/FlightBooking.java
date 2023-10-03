package com.acabes.assignment.gokulassignment.Sept29.flightbooking_Bank.flightboooking;



import com.acabes.assignment.gokulassignment.Sept29.bankaccount.Account;
import com.acabes.assignment.gokulassignment.Sept29.flightadmin.FlightAdmin;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlightBooking {
    public static void main(String[] args) {
        Map<FlightClass, String> personNameMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        char input_intial1 = 'a';
        char input_admin;
        FlightAdmin faadmin=null;
        System.out.println("Enter admin Setting press A/a or any other key to book ticket");
        input_intial1 = sc.next().charAt(0);
        Account ac=new Account();
        if (input_intial1 == 'a' || input_intial1 == 'A') {
            do {
              //  FlightAdmin faadmin1 = new FlightAdmin(101, 50);
              // faadmin1.addSample();
                System.out.println("Enter the Flight no");
                int flight_number = sc.nextInt();
                System.out.println("Flight number is" + flight_number);
                System.out.println("Enter the Number of Seats Available");
                int seats = sc.nextInt();
                faadmin = new FlightAdmin(flight_number, seats);

                faadmin.doAddFlightDetail(flight_number);
                System.out.println("Enter q to exit admin panel and any other to continue");
                input_admin=sc.next().charAt(0);
            }while (input_admin!='q');
        }
            do {
                System.out.println("Select a Flight From the given List");
                faadmin.displayAllFlightDetails();
                System.out.println("Enter the Flight no");
                int flight_number = sc.nextInt();
                System.out.println("Flight number is" + flight_number);
                System.out.println("Enter the number of seats");
                int seat = sc.nextInt();
                sc.nextLine();
                System.out.println("Current Flight no is" + flight_number);
                System.out.println("Enter the name of the Passenger");
                String passengerName = sc.nextLine();
                FlightClass ft = new FlightClass( passengerName);
                personNameMap.put(ft, passengerName);
                System.out.println("Enter the number of seats to be booked");
                int no_of_seat = sc.nextInt();
                System.out.println("flightnumber is" + flight_number);

                ft.bookSeat(no_of_seat, flight_number);
                System.out.println("Make Payment !");
                ac.makePayments();
                System.out.println("Remaining Seat");
                ft.getseat(flight_number);
                System.out.println("Do want to cancel the ticket press c");
                char input = sc.next().charAt(0);
                if (input == 'c') {
                    System.out.println("Enter the no of seat to be canceled");
                    int cancel_seat = sc.nextInt();
                    ft.cancelSeat(cancel_seat, flight_number);
                    System.out.println("Remaining Seat");
                    ft.getseat(flight_number);
                }
                System.out.println("Enter q to quit ");
                input_intial1 = sc.next().charAt(0);

            } while (input_intial1 != 'q');



    }
}

