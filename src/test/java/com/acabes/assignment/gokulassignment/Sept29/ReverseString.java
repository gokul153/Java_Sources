package com.acabes.assignment.gokulassignment.Sept29;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        String reversedInput = reverseInStringBuilder(input);
        System.out.println(reversedInput);
    }
    public static String reverseInStringBuilder(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
