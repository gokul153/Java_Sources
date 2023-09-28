package com.acabes.assignment.gokulassignment.Exception_28Sept;
class  CheckMethod{
    void method1(){
        method2();
    }
    void method2(){
        method3();
    }
    void method3(){

        Object nme =null;
        nme.toString();
    }
}
public class MainFour {
    public static void main(String[] args){
        CheckMethod mt=new CheckMethod();
        try {
            mt.method1();
        }catch (NullPointerException e){
            System.out.println("Null pointer is found");
           e.printStackTrace();
        }
    }
}
