package com.brunoyam.lesson1;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Условный оператор if
        System.out.println("На улице идет дождь?");
        boolean isRaining = scanner.nextBoolean();
        if (isRaining) {
            System.out.println("Возьмите с собой зонт!");
        } else {
            System.out.println("Можно не брать с собой зонт");
        }

        /*
         Практика
         Ввести с клавиатуры два целых числа a и b
         Написать программу, определяющую делится ли нацело a на b
         */

        System.out.println();
        int input;

        System.out.println("Загадайте число от 1 до 5 включительно");
        input = scanner.nextInt();
        if (input >= 1 && input <= 5) { // && - и, || - или
            if (input == 1) {
                System.out.println("Вы загадали цифру один");
            }

            if (input == 2) {
                System.out.println("Вы загадали цифру два");
            }

            if (input == 3) {
                System.out.println("Вы загадали цифру три");
            }

            if (input == 4) {
                System.out.println("Вы загадали цифру четыре");
            }

            if (input == 5) {
                System.out.println("Вы загадали цифру пять");
            }

//            if (input == 1) {
//                System.out.println("Вы загадали цифру один");
//            } else if (input == 2) {
//                System.out.println("Вы загадали цифру два");
//            } else if (input == 3) {
//                System.out.println("Вы загадали цифру три");
//            } else if (input == 4) {
//                System.out.println("Вы загадали цифру четыре");
//            } else {
//                System.out.println("Вы загадали цифру пять");
//            }
        } else {
            System.out.println("Вы загадали число не из диапазона 1..5");
        }

        System.out.println();

        System.out.println("Загадайте число от 1 до 5 включительно");
        input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Вы загадали цифру один");
                break;
            case 2:
                System.out.println("Вы загадали цифру два");
                break;
            case 3:
                System.out.println("Вы загадали цифру три");
                break;
            case 4:
                System.out.println("Вы загадали цифру четыре");
                break;
            case 5:
                System.out.println("Вы загадали цифру пять");
                break;
            default:
                System.out.println("Вы загадали число не из диапазона 1..5");
        }

        /*
         Практика
         Ввести с клавиатуры число в диапазоне 1..10
         Написать программу, определяющую является ли четным введенное число
         */
    }
}
