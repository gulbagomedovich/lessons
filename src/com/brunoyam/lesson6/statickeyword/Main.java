package com.brunoyam.lesson6.statickeyword;

import static java.lang.Math.*;
//import static java.lang.Math.sin;

public class Main {
    int noStaticVariable;
    static int staticVariable;

    public static void main(String[] args) {
        System.out.println("Number of cars: " + Car.numberOfCars);

        Car orangeCar = new Car("Orange");
        System.out.println("Number of cars: " + orangeCar.numberOfCars);

        Car blueCar = new Car("Blue");
        System.out.println("Number of cars: " + blueCar.numberOfCars);

//        MathUtil mathUtil = new MathUtil();
        int result = MathUtil.sum(2, 3);
        System.out.println("Result: " + result);

//        System.out.println(noStaticVariable);
        System.out.println(staticVariable);

        // Статический импорт
        System.out.println("PI: " + PI);
        System.out.println("Синус тридцати градусов: " + sin(PI / 6));
    }
}
