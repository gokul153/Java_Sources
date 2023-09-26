package com.acabes.assignment.gokulassignment;

import java.util.Scanner;

public class Problemgreat {
   public static void main(String[] args){
       int num1, num2, num3;

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the first number");
       num1 = sc.nextInt();
       System.out.print("Enter the second number");
       num2 = sc.nextInt();
       System.out.print("Enter the third number");
       num3 = sc.nextInt();
       if (num1 > num2 && num1 > num3) {
           System.out.println("greatest is" + num1);
       } else if (num2 > num3) {
           System.out.println("greatest is" + num2);

       }
       else {
           System.out.println("greatest is" + num3);
       }
   }

}
