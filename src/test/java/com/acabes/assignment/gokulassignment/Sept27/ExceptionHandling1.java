package com.acabes.assignment.gokulassignment.Sept27;

import java.util.Scanner;

public class ExceptionHandling1 {

    public static void main(String[] args){
        int flag=0;
        System.out.println("Enter the String to be checked");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();


        char charArray[] = str.toCharArray();
        int len=str.length();

        for(int i=0;i<str.length();i++){
            if(charArray[i]=='a'||charArray[i]=='e'||charArray[i]=='o'||charArray[i]=='u'){
                flag=1;
                break;
            }
        }
        try{
            if(flag==0){
                 int data =flag/0;
            }
            else{
                System.out.println("It contains vowel");
            }
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
