package com.deven;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // write a function that prints hello world
        message();
    }

    static void message() {
        System.out.println("Hello World");  //  It will print this
        message1(); //  then it will execute message1()
    }

    static void message1() {
        System.out.println("Hello World");  //  Now this will execute
        message2(); //  then it will execute message2()
    }

    static void message2() {
        System.out.println("Hello World");
        message3();
    }

    static void message3() {
        System.out.println("Hello World");
        message4();
    }

    static void message4() {
        System.out.println("Hello World");
    }
}