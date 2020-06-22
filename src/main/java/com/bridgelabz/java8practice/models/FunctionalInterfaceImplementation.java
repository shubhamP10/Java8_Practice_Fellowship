package com.bridgelabz.java8practice.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface MyFunctionalInterface {
    int addMethod(int a, int b);
}

public class FunctionalInterfaceImplementation {
    private static List<String> getBeginWith(List<String> list, Predicate<String> valid){
        List<String> selected = new ArrayList<>();
        list.forEach(player -> {
            if (valid.test(player)){
                printNames(()->player);
                selected.add(player);
            }
        });
        return selected;
    }

    private static void printNames(Supplier<String> names){
        System.out.println(names.get());
    }

    public static void interfaceImplementation(){
        MyFunctionalInterface sum = (a, b) -> a + b;
        IntBinaryOperator sum2 = (a, b) -> a + b;
        String[] players = {"Shubham Pattar", "Sudarshan Pattar", "Akhil Lingeri"};

        System.out.println("Using user defined Interface Sum of a + b = " + sum.addMethod(12, 20));
        System.out.println("Using Pre-Defined Interface Sum of a + b = " + sum2.applyAsInt(30, 40));

        //using Consumer<T> Interface
        System.out.println("\nUsing Consumer<T> Interface");
        Arrays.asList(players).forEach(System.out::println);

        //Using Function<T, R> Interface
        System.out.println("\nUsing Function<T, R> Interface");
        Function<String[], String> converter = (all) -> {
            String names = "";
            for (String n : all) {
                String forName = n.substring(0, n.indexOf(""));
                forName = n.substring(n.indexOf("")) + " " + forName;
                names += forName + "\n";
            }
            return names;
        };
        System.out.println(converter.apply(players));

        //Using Predicate<T> Interface
        System.out.println("\nUsing Predicate<T> Interface");
        List<String> playerList = Arrays.asList(players);
        System.out.println(getBeginWith(playerList,(s)->s.startsWith("S")));
        System.out.println(getBeginWith(playerList,(s)->s.startsWith("A")));

        //Using Supplier<T> Interface
        System.out.println("\nUsing Supplier<T> Interface");
        getBeginWith(playerList,(s)->s.startsWith("S"));
        getBeginWith(playerList,(s)->s.startsWith("A"));

        /*Using Runnable Interface
         * Implementation Without Using Lambda
         * Implementation Using Lambda Runnable
         * Implementation Using Lambda & Runnable Interface
         * */
        System.out.println("\nUsing Runnable Interface");
        System.out.println(Thread.currentThread().getName()+" application : is Running");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" is Running");
            }
        });
        thread.start();
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName()+" is Running");
        };
        new Thread(task).start();
        new Thread(() -> System.out.println(Thread.currentThread().getName()+" is Running")).start();
    }
}
