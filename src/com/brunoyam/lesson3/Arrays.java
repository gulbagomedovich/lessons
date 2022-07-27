package com.brunoyam.lesson3;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int[] intArray = new int[5];    // объявляем и выделяем место в памяти

        System.out.println(intArray[0]); // по умолчанию массив заполняется нулями
        System.out.println(intArray.length);

        System.out.println();

//        intArray[0] = 0; // по умолчанию равен нулю
        intArray[1] = 10;
        intArray[2] = 20;
        intArray[3] = 30;
        intArray[4] = 40;

//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = i * 10;
//        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        System.out.println();

        int[] intArray2 = {1, 2, 3};
        for (int i = 0; i < intArray2.length; i++) {
            System.out.println(intArray2[i]);
        }

        System.out.println();

        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }

//        // Цикл for-each
//        for (String season : seasons) {
//            System.out.println(season);
//        }

        System.out.println();

        /*
         Практика
         Найти минимальное число в массиве случайных чисел
         Размер массива - 10, максимальное случайное число - 99
         */
        int[] numbers = new int[10];

//        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(100);
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int min = 99;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Минимальное число: " + min);

        System.out.println();

        /*
         Одномерные массивы:
         1, 2, 3

         Двумерные массивы:
         [0]: 1, 2, 3
         [1]: 4, 5, 6

         Обращение к элементам двумерного массива: <название массива>[a][b], где:
         a - индекс строки, b - индекс элемента в строке

         Например, чтобы обратиться к элементу приведенного двумерного массива со значением 6:
         <название массива>[1][2]
         */
        int[][] twoDimensionalArray = new int[2][3];

        twoDimensionalArray[0][0] = 1;
        twoDimensionalArray[0][1] = 2;
        twoDimensionalArray[0][2] = 3;

        twoDimensionalArray[1][0] = 4;
        twoDimensionalArray[1][1] = 5;
        twoDimensionalArray[1][2] = 6;

//        int[][] twoDimensionalArray = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
            System.out.println();
        }

//        for (int[] oneDimensionalArray : twoDimensionalArray) {
//            for (int element : oneDimensionalArray) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
    }
}
