package com.acabes.assignment.gokulassignment;

import java.util.Scanner;

class Employee{
    String employyeid;
    String EmployyeName;
    double salary;
    Employee(String employyeid,String EmployyeName,double Salary){
        this.employyeid=employyeid;
        this.EmployyeName=EmployyeName;
        this.salary=Salary;
    }
    public static double calculateannualsalary(double salary){
        return salary*12;
    }
    void displayEmployeeInfo(){
        calculateannualsalary(this.salary);
        System.out.println("Employee id"+employyeid);
        System.out.println("Employee name"+EmployyeName);
        System.out.println("Employee salary"+salary);
    }
}

public class EmployeeManger {
    public static void main(String[] args) {
        char input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter Employee id");
            String employeeid= scanner.nextLine();
            System.out.println("Enter Employee name");
            String employeename= scanner.nextLine();
            System.out.println("Enter Employee Salary");
            double employeesalary= scanner.nextDouble();
            Employee e= new Employee(employeeid,employeename,employeesalary);
            e.displayEmployeeInfo();
            System.out.print("Enter q to quit entering or any other button to countinue");
            input = scanner.next().charAt(0);
        } while (input != 'q');

    }
}
