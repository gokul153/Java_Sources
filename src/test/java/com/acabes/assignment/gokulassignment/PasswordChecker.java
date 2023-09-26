package com.acabes.assignment.gokulassignment;

import java.util.Scanner;

class password {

    int flag = 0;

    public boolean getcount(String password_send) {
        int upper = 0, lower = 0, digit = 0;
        char[] charArray = password_send.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                upper++;
            }
            if (Character.isLowerCase(charArray[i])) {
                lower++;
            }
            if (Character.isDigit(charArray[i])) {
                digit++;
            }
        }
        System.out.println("Upper is :" + upper);
        System.out.println("lower is :" + lower);
        System.out.println("digit is :" + digit);
        if (upper < 1 || lower < 1 || digit < 1) {
            System.out.println("one chearacter,one digit ,one upper");
            return true;
        } else {
            System.out.println("Constrains satisfied");
            return false;
        }
    }

    public void checkpassword(String password_send) {
        if (password_send.length() < 8) {
            flag = 0;
            System.out.println("Minimum character 8");
        } else if (getcount(password_send)) {
            flag = 0;
            System.out.println("Minimum 1 character,digit,number");
        } else {
            flag = 1;
        }
    }
}

public class PasswordChecker {
    public static void main(String[] args) {
        password pa = new password();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the password ");

            String password = scanner.nextLine();
            pa.checkpassword(password);

        } while (pa.flag == 0);

    }
}
