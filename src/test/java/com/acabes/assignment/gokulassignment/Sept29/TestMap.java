package com.acabes.assignment.gokulassignment.Sept29;

import java.io.Serial;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMap {
    public static  void main(String[] args){
        String name;
        int age;
        int compare_age=0;                                     //Age Comparision
        Map<String,Integer> friendsDetails=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        char input;
        do{
            System.out.println("Enter the name ");
            sc.nextLine();
            name=sc.nextLine();
            System.out.println("Age is ");
            age= sc.nextInt();
            friendsDetails.put(name,age);
            System.out.println("Enter q to exit");
            input=sc.next().charAt(0);
        }while (input!='q');
        for(Map.Entry<String,Integer> entry:friendsDetails.entrySet()){
            System.out.println("Name :"+entry.getKey()+"  Age ="+entry.getValue());
        }


    }
}
