package com.bridgelabz.java8practice;

import com.bridgelabz.java8practice.models.FunctionalInterfaceImplementation;
import com.bridgelabz.java8practice.models.StaticAndDefaultMethodInInterfaceExample;

import java.util.Scanner;

public class Java8Practice {

    public static void main(String[] args) {
        int i = 0;
        Scanner input = new Scanner(System.in);
        while (i == 0) {
            System.out.println("JAVA 8 Features Implementation\n" +
                    "1. Functional Interface\n" +
                    "2. Static and Default Interface\n" +
                    "3. Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    FunctionalInterfaceImplementation.interfaceImplementation();
                    break;
                case 2:
                    StaticAndDefaultMethodInInterfaceExample.differentMethodsInInterface();
                    break;
                case 3:
                    i = 1;
                    break;
            }
        }
    }
}
