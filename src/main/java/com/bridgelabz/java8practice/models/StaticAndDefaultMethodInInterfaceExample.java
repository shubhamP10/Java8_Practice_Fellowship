package com.bridgelabz.java8practice.models;

interface SampleInterface {
    /*Static Method*/
    static void staticMethod() {
        System.out.println("Static Method");
    }

    /*Abstract Method*/
    void abstractMethod(String str);

    /*Default method*/
    default void defaultMethod() {
        System.out.println("Default Method of SampleInterface");
    }
}

interface SampleInterface2 {
    default void defaultMethod() {
        System.out.println("Default Method of SampleInterface2");
    }

    void disp(String str);
}

public class StaticAndDefaultMethodInInterfaceExample implements SampleInterface, SampleInterface2 {
    public static void differentMethodsInInterface() {
        System.out.println("\nInterface Implementation");
        StaticAndDefaultMethodInInterfaceExample obj = new StaticAndDefaultMethodInInterfaceExample();
        obj.defaultMethod();
        SampleInterface.staticMethod();
        obj.abstractMethod("Calling Abstract Method");
    }

    @Override
    public void abstractMethod(String str) {
        System.out.println("String is: " + str);
    }

    @Override
    public void disp(String str) {
        System.out.println("String is: " + str);
    }

    @Override
    public void defaultMethod() {
        System.out.println("Implementation of Default Method");
    }
}
