package com.acabes.assignment.gokulassignment;

import java.util.Scanner;

public class Number_guessing {
  public  static  void main(String[] args){
      int input;
      Scanner scanner = new Scanner(System.in);
      int max = 100;
      int min = 0;
      int range = max - min + 1;
      int random_number = (int)(Math.random() * range) + min;
      //System.out.println(random_number);
      do{
          System.out.println("Enter the prediction");
          input=scanner.nextInt();
         if(input>random_number){
             System.out.println("prediction is Greater than the random number");
         }
         else if(input<random_number){
              System.out.println("prediction is Lesser than the random number");
          }
         else  if(input==random_number){
             System.out.println("Congrats! You won the game");
         }
      }while (input!=random_number);
  }
}
