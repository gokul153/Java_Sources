package com.acabes.assignment.gokulassignment.Sept29.flightadmin;

//import  com.acabes.assignment.gokulassignment.Sept29.flightbooking_Bank.*;
import com.acabes.assignment.gokulassignment.Sept29.flightbooking_Bank.flightboooking.FlightBooking;
import com.acabes.assignment.gokulassignment.Sept29.flightbooking_Bank.flightboooking.FlightClass;

import java.util.*;

public class FlightAdmin extends FlightBooking {
    String fromCity;
    String toCity,startTime,endTime;
    int price;
    Map<Integer, List<FlightDetails>> flightDetailMap = new HashMap<>();

    // Adding flight details for flight number 101
    List<FlightDetails> flightDetailsList = new ArrayList<>();
  //  Map<Integer, List<String,String,String,String>> flightDetailMap =new Hashtable<>();
    //List<> flight1= new ArrayList<>();
    public FlightAdmin(int flightNumber,int seats){


        FlightClass.flightMap.put(flightNumber,seats);
        for(int i=0;i<seats;i++) {
            FlightClass.seatalignment.add(i,1);
        }
    }
    public void addSample(){
        flightDetailsList.add(new FlightDetails("CityB", "CityC", "10:30 AM", 120.0));

        flightDetailMap.put(101, flightDetailsList);
        System.out.println("Sample added 101 flight no"+flightDetailMap.get(101));
        for (FlightDetails details : flightDetailsList)
        {
            System.out.println("Flight 101 Details:");
            System.out.println("From: " + details.getFromCity());
            System.out.println("To: " + details.getToCity());
            System.out.println("Start Time: " + details.getStartTime());
            System.out.println("Price: " + details.getPrice());
            System.out.println();
        }
    }
    public void doAddFlightDetail(int flightNo) {
         Scanner sc=new Scanner(System.in);
        //List<FlightDetails> flightDetailsList = new ArrayList<>();
        System.out.println("Enter From CIty");
        this.fromCity=sc.nextLine();
        System.out.println("Enter To City");
        this.toCity=sc.nextLine();
        System.out.println("Enter the Price");
        this.price=sc.nextInt();

        flightDetailsList.add(new FlightDetails(fromCity, toCity, fromCity, price));

        flightDetailMap.put(flightNo,flightDetailsList);
        System.out.println("Entered details are ");
        for (FlightDetails details : flightDetailsList)
        {
            System.out.println("Flight "+flightNo+" Details:");
            System.out.println("From: " + details.getFromCity());
            System.out.println("To: " + details.getToCity());
            System.out.println("Start Time: " + details.getStartTime());
            System.out.println("Price: " + details.getPrice());
            System.out.println();
        }
    }

    public void displayAllFlightDetails() {
        for (Map.Entry<Integer, List<FlightDetails>> entry : flightDetailMap.entrySet()) {
            int flightNumber = entry.getKey();
            List<FlightDetails> detailsList = entry.getValue();

            System.out.println("Flight " + flightNumber + " Details:");
            for (FlightDetails details : detailsList) {
                System.out.println("From: " + details.getFromCity());
                System.out.println("To: " + details.getToCity());
                System.out.println("Start Time: " + details.getStartTime());
                System.out.println("Price: " + details.getPrice());
                System.out.println();
            }
        }
    }
}
