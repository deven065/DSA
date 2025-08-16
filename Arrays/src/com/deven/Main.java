package com.deven;

public class Main {
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store 5v roll numbers
        String name = "Kunal Kushwaha";

        // Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        // syntax
        // datatype[] variable_name = new datatype[size];
        // int[] rnos = new int[5];
        // or directly
        // int[] rnos = {23, 12, 45, 32, 15};

        int[] rnos; // declaration of array. rnos is getting defined in the stack
        rnos = new int[5]; // initialisation: actually here object is being created in the memory (heap)

//        System.out.println(rnos[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}
