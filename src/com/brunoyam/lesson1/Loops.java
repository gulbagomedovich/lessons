package com.brunoyam.lesson1;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Выводим 3 раза в консоль без цикла
        System.out.println("Hello, world!");
        System.out.println("Hello, world!");
        System.out.println("Hello, world!\n");

        // Выводим 3 раза в консоль с циклом while
        int count = 0;
        while (count < 3) {
            System.out.println("Hello, world!");
            count = count + 1;
//            count++;  // эквивалентно выражению: count = count + 1;
        }

        System.out.println();
        int y, x = 0;

        // Инкремент
        y = x++;
        System.out.println("x = " + x + ", y = " + y);
        y = ++x;
        System.out.println("x = " + x + ", y = " + y);

        // Декремент
        y = x--;
        System.out.println("x = " + x + ", y = " + y);
        y = --x;
        System.out.println("x = " + x + ", y = " + y);

        System.out.println();

        // Лучше использовать цикл do-while
        Scanner scanner = new Scanner(System.in);

        System.out.println("Чтобы подтвердить, что вы не робот, введите 555");
        int input = scanner.nextInt();

        while (input != 555) {
            System.out.println("Чтобы подтвердить, что вы не робот, введите 555");
            input = scanner.nextInt();
        }

        System.out.println("Вы не робот!");

//        Scanner scanner = new Scanner(System.in);
//
//        int input;
//        do {
//            System.out.println("Чтобы подтвердить, что вы не робот, введите 555");
//            input = scanner.nextInt();
//        } while (input != 555);
//
//        System.out.println("Вы не робот!");

        System.out.println();

        // Цикл for
        for (int i = 0; i < 10; i++ /* i += 5 */) { // можно убрать фигурные скобки, если только 1 оператор
            System.out.println("i = " + i);
        }

        /*
         Практика
         Сделать шифратор цезаря
         */

        System.out.println();

        // Операторы break и continue в цикле for
        for (int i = 0; i < 10; i++ /* i += 5 */) {
            // Останавливаем цикл, если i == 9
            if (i == 9) {
                break;
            }

            // Переходим на следующую итерацию цикла, если i == 5
            if (i == 5) {
                continue;
            }

            System.out.println("i = " + i);
        }

        System.out.println();

        // Операторы break и continue в цикле while
        count = 0;
        while (count < 10) {
            // Останавливаем цикл, если i == 9
            if (count == 9) {
                break;
            }

            // Переходим на следующую итерацию цикла, если i == 5
            if (count == 5) {
                count++;    // без него программа будет работать бесконечно
                continue;
            }

            System.out.println("count = " + count);
            count++;
        }

        System.out.println();

        // Операторы break и continue во вложенных циклах
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
//                if (i == 1 && j == 3) {
//                    continue outer;
//                }

//                if (i == 2 && j == 4) {
//                    break outer;
//                }

                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println();

        /*
         Практика
         Вывести наибольшое простое число, не превышающее n
         */
        int n = 15;

        outer:
        for (int i = n; i > 1; i--) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }

            System.out.println("Наибольшое простое число: " + i);
            break;
        }

        /*
         ДЗ
         Easy: Вывести на экран последовательность чисел от 0 до n в обратном порядке
         Medium: Вывести последовательность фибоначи до n
         Hard: Вывести таблицу умножения
         */
    }
}
