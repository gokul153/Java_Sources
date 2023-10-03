package com.acabes.assignment.gokulassignment.Sept29;
import java.util.*;
import java.io.*;
public class HashSet {
    public static void main(String[] args){
        java.util.HashSet<String> hashSet1=new java.util.HashSet<>();
        hashSet1.add("Gokul");
        hashSet1.add("Akshay");
        hashSet1.add("Sanoop");
        hashSet1.add("Kiran");
        hashSet1.add("Gokul");
        System.out.println(hashSet1);
        java.util.HashSet<String> hashSet2=new java.util.HashSet<>();
        hashSet2.add("Ramesh");
        hashSet2.add("Rahul");
        hashSet2.add("Sanoop");
        System.out.println(hashSet2);
        Set<String> duplicates = new java.util.HashSet<>(hashSet1);
        duplicates.retainAll(hashSet2);
        System.out.println("Duplicate elements are"+duplicates);


    }
}
