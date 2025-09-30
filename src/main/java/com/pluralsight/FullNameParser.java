package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        String preTrim = name.trim();

        String[] testName = preTrim.split("\\s+ ");

        if(testName.length == 3) {
            System.out.println("First Name: " + testName[0]);
            System.out.println("Middle Name: " + testName[1]);
            System.out.println("Last Name: " + testName[2]);
        } else {
            System.out.println("First Name: " + testName[0]);
            System.out.println("Middle name: (none)");
            System.out.println("Last Name: " + testName[1]);
        }
    }
}
