package com.acabes.assignment.gokulassignment.Exception_28Sept;

import java.util.Scanner;

public class ArrayIndexException {
    public  static  void main(String[] args){
        int[] A={1,3,6,7,5,9};
        int length= A.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Index to be accessed");
        try{
            int size=sc.nextInt();
            System.out.println(A[size]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("PLease enter element less than "+length);
            System.out.println(e);

        }
    }
}
