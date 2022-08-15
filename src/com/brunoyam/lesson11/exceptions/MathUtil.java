package com.brunoyam.lesson11.exceptions;

public class MathUtil {
    public static int divide(int number1, int number2) throws CheckedArithmeticException {
        if (number2 == 0) {
//            throw new ArithmeticException("На ноль делить нельзя!");
            throw new CheckedArithmeticException("На ноль делить нельзя!");
        }

        return number1 / number2;
    }
}
