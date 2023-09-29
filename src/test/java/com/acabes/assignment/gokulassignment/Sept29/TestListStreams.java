package com.acabes.assignment.gokulassignment.Sept29;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestListStreams {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(10);
        names.add("Gokul");
        names.add("Hari");
        names.add("Deepak");
        names.add("Haridharsh");
        names.add("Manu");
        System.out.println("Enter the string to be searched");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        boolean result= names.contains(name);
        System.out.println("Check Result is "+result);
        ArrayList<String> startsWithH=names
                .stream()
                .filter(g -> g.contains("Hari"))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Starts with"+startsWithH);

    }
}
