package com.bridgelabz.java8practice.models;

import java.util.ArrayList;
import java.util.List;

interface MathOperation {
    int operation(int a, int b);
}

interface StringInterface {
    String strConcat(String a, String b);
}

public class LambdaExpressionExample {
    public static void lambdaExample() {
        System.out.println("\nLambda Operations");
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;
        MathOperation div = (a, b) -> a / b;
        System.out.println("12 + 10 = " + add.operation(12, 10));
        System.out.println("12 - 10 = " + sub.operation(12, 10));
        System.out.println("12 * 10 = " + mul.operation(12, 10));
        System.out.println("12 / 10 = " + div.operation(12, 10));
        StringInterface strConcat = (str1, str2) -> str1 + str2;
        System.out.println(strConcat.strConcat("Hello ", "Java"));
        List<String> list = new ArrayList<>();
        list.add("shubham");
        list.add("pattar");
        list.add("KA");
        list.forEach(System.out::println);

    }
}
