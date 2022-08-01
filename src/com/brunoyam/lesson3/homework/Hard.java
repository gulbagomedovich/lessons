package com.brunoyam.lesson3.homework;

import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        System.out.println("Программа выводит последовательность Фибоначчи до F(n) включительно.");
        System.out.print("Введите n: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.printf("Последовательность Фибоначчи до F(%d): ", n);

        int fib0 = 0;
        int fib1 = 1;
        if (n >= 2) {
            int[] fibNumbers = new int[n + 1];

            fibNumbers[0] = fib0;
            fibNumbers[1] = fib1;

            System.out.print(fibNumbers[0] + " " + fibNumbers[1] + " ");

            for (int i = 2; i <= n; i++) {
                fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
                System.out.print(fibNumbers[i] + " ");
            }
            System.out.println();
        } else if (n == 1) {
            System.out.println(fib0 + " " + fib1);
        } else if (n == 0) {
            System.out.println(fib0);
        } else {
            System.out.println("Вы ввели отрицательное число!");
        }
    }
}
