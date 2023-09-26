package com.acabes.assignment.gokulassignment;

import java.util.Scanner;

class student{
   private String studentid;
    private String studentname;
   private int studentclass;
   private int total_marks;
    student(String id,String name){
        studentid=id;
        studentname=name;

    }
    static void calculate_grade(int marks){
        if(marks>90&&marks<100){
            System.out.print("The grade is A");
        }

        else if(marks>80&&marks<90){
            System.out.print("The grade is B");
        }
        else if(marks>70&&marks<80){
            System.out.print("The grade is C");
        }
        else if(marks>60&&marks<70){
            System.out.print("The grade is D");
        }
        else if(marks>100){
            System.out.print("ERROR IN MARKS");
        }
        else{
            System.out.print("The grade is F");
        }
    }
}



public class Grade_calculator {

    public  static void main(String[] args){
        System.out.print("check");
        Scanner scanner=new Scanner(System.in);
        char input;
        do{

            System.out.print("Enter the student id");
            String studentid=scanner.nextLine();
            System.out.print("Enter the student name");
            String name=scanner.nextLine();
            student st=new student(studentid,name);
            System.out.print("Enter the student marks");
            int marks=scanner.nextInt();
            student.calculate_grade(marks);
            System.out.print("Enter q to quit entering or any other button to countinue");
            input=scanner.next().charAt(0);

        }while (input!='q');
    }
}
