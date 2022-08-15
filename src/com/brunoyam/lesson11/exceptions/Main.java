package com.brunoyam.lesson11.exceptions;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("8 / 4 = " + MathUtil.divide(8, 4));

//        System.out.println("8 / 0 = " + MathUtil.divide(8, 0));

        try {
//            System.out.println("8 / 0 = " + MathUtil.divide(8, 0));
            System.out.println("8 / 2 = " + MathUtil.divide(8, 2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("After try-catch");
        }*/

        // Java не предупреждает, что метод divide может выбросить исключение
        try {
            System.out.println("8 / 0 = " + MathUtil.divide(8, 0));
        } catch (CheckedArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
