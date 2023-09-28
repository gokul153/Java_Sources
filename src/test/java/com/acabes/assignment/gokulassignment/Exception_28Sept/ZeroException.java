package com.acabes.assignment.gokulassignment.Exception_28Sept;

import java.util.Scanner;

public class ZeroException {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the input1\n");
        int input1=sc.nextInt();
        System.out.println("Enter the divisor\n");
        int input2= sc.nextInt();
        try{
            int result = input1/input2;

        }catch (ArithmeticException e){
            System.out.println("Divisor cannot be zero");
            System.out.println(e);
        }
    }
}
