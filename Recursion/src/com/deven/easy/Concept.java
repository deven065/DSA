package com.deven.easy;

public class Concept {
    public static void main(String[] args) {

    }
    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(--n);

//        n-- vs --n

    }
}
