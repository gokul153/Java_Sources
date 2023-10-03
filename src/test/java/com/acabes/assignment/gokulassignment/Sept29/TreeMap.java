package com.acabes.assignment.gokulassignment.Sept29;
import java.util.*;

public class TreeMap {
    public static void main(String[] args) {
        // Create a TreeMap with Integer keys and String values
        Map<Integer, String> treeMap = new java.util.TreeMap<>();
        Scanner sc =new Scanner(System.in);

        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3,"Three");
        treeMap.put(4, "Four");
        treeMap.put(0,"Zero");


        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("ENter the element to be found");
        int input=sc.nextInt();
        if(treeMap.containsKey(input)){
            System.out.println(treeMap.get(input));
            treeMap.remove(input);
        }
        for (int key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

    }
}
