package com.acabes.assignment.gokulassignment.Sept29;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestMapStream {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        Map<String,Integer> friendsDetails= stringIntegerHashMap;
        friendsDetails.put("Gokul Das",26);
        friendsDetails.put("Deepak Das",27);
        friendsDetails.put("Dhanush",29);
        System.out.println("Key value pairs are"+friendsDetails);
        System.out.println("Enter the key to be searched");
        String key=sc.nextLine();
        if(friendsDetails.containsKey(key)){
            System.out.println("Found");
           System.out.println("Friends Details is"+ friendsDetails.get(key));
        }
        System.out.println("Retriving via Stream");
        Optional<Integer> findDetail = friendsDetails.entrySet().stream()
                .filter( e->key.equals(e.getKey()))
                .map(Map.Entry::getValue)
                .findFirst();
        System.out.println(findDetail.get());;
    }

}
