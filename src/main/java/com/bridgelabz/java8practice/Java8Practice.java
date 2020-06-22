package com.bridgelabz.java8practice;

import com.bridgelabz.java8practice.models.FunctionalInterfaceImplementation;
import com.bridgelabz.java8practice.models.LambdaExpressionExample;
import com.bridgelabz.java8practice.models.StaticAndDefaultMethodInInterfaceExample;
import com.bridgelabz.java8practice.models.StreamOperationExample;

import java.util.Scanner;

public class Java8Practice {

    public static void main(String[] args) {
        int i = 0;
        Scanner input = new Scanner(System.in);
        while (i == 0) {
            System.out.println("\nJAVA 8 Features Implementation\n" +
                    "1. Functional Interface\n" +
                    "2. Static and Default Interface\n" +
                    "3. Lambda Expression Examples\n" +
                    "4. Stream Examples\n" +
                    "5. Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    FunctionalInterfaceImplementation.interfaceImplementation();
                    break;
                case 2:
                    StaticAndDefaultMethodInInterfaceExample.differentMethodsInInterface();
                    break;
                case 3:
                    LambdaExpressionExample.lambdaExample();
                    break;
                case 4:
                    StreamOperationExample.streamExample();
                    break;
                case 5:
                    i = 1;
                    break;
            }
        }
    }
}
