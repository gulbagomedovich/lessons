package com.brunoyam.lesson6;

public class FinalKeyword {
    /*static */final int MY_FINAL_INTEGER = 0;

    public static void main(String[] args) {
        final double PI = 3.14;
//        PI = 1.0;
        System.out.println("PI: " + PI);

//        MY_FINAL_INTEGER = 10;

        printConstant("Hello, world!");
    }

    static void printConstant(final String CONSTANT) {
//        CONSTANT = "modified";
        System.out.println("Constant: " + CONSTANT);
    }
}
