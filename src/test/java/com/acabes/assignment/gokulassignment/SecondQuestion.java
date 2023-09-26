package com.acabes.assignment.gokulassignment;

import java.util.Arrays;
import java.util.Scanner;

public class SecondQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be checked");
        String name = sc.nextLine();
        char[] duplicateArray = new char[50];
        int j = 0;
        char charArray[] = name.toCharArray();
        Arrays.sort(charArray);
        System.out.print(charArray);
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                duplicateArray[j] = charArray[i + 1];
                j++;
                charArray[i] = 'd';
            }

        }

        System.out.println("Result :");
        int i = 0;
        for (char c : charArray) {
            if (charArray[i] != 'd') {
                System.out.print(charArray[i]);
            }
            i++;
        }
    }
}
