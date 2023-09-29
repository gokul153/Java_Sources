package com.acabes.assignment.gokulassignment.Sept29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class TestList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String namesToBeAdded;
        List<String> names = new ArrayList<>(10);
        names.add("Gokul");
        names.add("Hari");
        names.add("Deepak");
        names.add("Haridharsh");
        names.add("Manu");
        System.out.println(names);
        System.out.println("Enter the number of string to be added");
        int num= sc.nextInt();
       do{
            System.out.println("Enter the name to be added");
            namesToBeAdded=sc.nextLine();
           namesToBeAdded=sc.nextLine();
            names.add(namesToBeAdded);
            num--;
       }while (num>0);
        System.out.println("Do you want to remove elements");
        System.out.println("Enter the index to be delected");

        int index=sc.nextInt();
        names.remove(index);
        System.out.println(names);
        System.out.println(names.size());
    }
}
