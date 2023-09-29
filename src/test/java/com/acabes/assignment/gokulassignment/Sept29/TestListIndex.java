package com.acabes.assignment.gokulassignment.Sept29;

import java.util.*;

public class TestListIndex {
    public static void main(String[] args){
        String friendName;
        String townName;

        Map<String,String> friendsDetails=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        char input;
        do{
            System.out.println("Enter the name ");

            friendName=sc.nextLine();
            System.out.println("Enter Town name ");
            townName= sc.nextLine();
            friendsDetails.put(friendName,townName);
            System.out.println("Enter q to exit");
            input=sc.next().charAt(0);
            sc.nextLine();
        }while (input!='q');
        System.out.println(friendsDetails);
        System.out.println("Enter the name to be searched");

        String searchName=sc.nextLine();
        System.out.println(friendsDetails.get(searchName));

    }
}
