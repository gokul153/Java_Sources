package com.acabes.assignment.gokulassignment.Sept29.flightadmin;

class FlightDetails {
    private String fromCity;
    private String toCity;
    private String startTime;
    private double price;

    public FlightDetails(String fromCity, String toCity, String startTime, double price) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.startTime = startTime;
        this.price = price;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public String getStartTime() {
        return startTime;
    }

    public double getPrice() {
        return price;
    }
}