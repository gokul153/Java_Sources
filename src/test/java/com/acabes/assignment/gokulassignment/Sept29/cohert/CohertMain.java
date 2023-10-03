package com.acabes.assignment.gokulassignment.Sept29.cohert;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CohertMain {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY");

    public static void main(String[] args) {
        List<Cohort1> cohort1List = new ArrayList<>();
        List<Cohort4> cohort4List = new ArrayList<>();
        boolean exit = false;

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("Choose an option: \n1.Add employee to Cohort1 \n2.Add employee to Cohort4 \n3.Same age print\n4.Exit");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    addCohortOne(cohort1List);
                    break;
                case 2:
                    addCohortFour(cohort4List);
                    break;
                case 3:
                    compareAndPrintSameAges(cohort1List, cohort4List);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (!exit);
    }

    public static void addCohortOne(List<Cohort1> cohort1List) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter city:");
        String city = sc.nextLine();
        System.out.println("Enter date of birth (DD/MM/YYYY):");
        String dobStr = sc.nextLine();
        Date dob;
        try {
            dob = dateFormat.parse(dobStr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        cohort1List.add(new Cohort1(name, age, city, dob));
        System.out.println("Employee added to Cohort1.");
    }

    public static void addCohortFour(List<Cohort4> cohort4List) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter city:");
        String city = sc.nextLine();
        System.out.println("Enter date of birth (DD/MM/YYYY):");
        String dobStr = sc.nextLine();
        Date dob;
        try {
            dob = dateFormat.parse(dobStr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        cohort4List.add(new Cohort4(name, age, city, dob));
        System.out.println("Employee added to Cohort4.");

    }

    public static void compareAndPrintSameAges(List<Cohort1> cohort1List, List<Cohort4> cohort4List) {
        for (Cohort1 cohort1 : cohort1List) {
            for (Cohort4 cohort4 : cohort4List) {
                if (cohort1.getAge() == cohort4.getAge()) {
                    System.out.println("Cohort1: " + cohort1.getName() + " Age: " + cohort1.getAge());
                    System.out.println("Cohort4: " + cohort4.getName() + " Age: " + cohort4.getAge());
                    System.out.println();
                }
            }
        }
    }
}

