package com.acabes.assignment.gokulassignment.Exception_28Sept;


import java.util.Scanner;

 class Main {
      void method() throws CustomExeption
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number");
          int num = sc.nextInt();
          if(num<0){
              throw new CustomExeption("Exception in method");
          }
      }

}
 class CustomExeption extends  Exception{
     CustomExeption(String m){
         super((m));

     }
     public void get_errorcode(){
         System.out.println("Custom error code");
     }
}
class MainWorker{
     public static void main(String[] args){
         Main mn=new Main();
         try {
             mn.method();
         }catch (CustomExeption e){
             e.get_errorcode();
             System.out.println(e);
         }
     }
}