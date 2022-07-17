package com.brunoyam.lesson1;

public class Variables {
    public static void main(String[] args) {
        // Доступна только внутри метода main
        int intVariable;    // объявляем переменную
        intVariable = 2000;  // инициализируем переменную
        System.out.println(intVariable);

        /*
         Объявляем и инициализируем переменную
         в одной строке
         */
        int intVariable2 = 999;
        System.out.println(intVariable2);

        int intVariable3 = intVariable + intVariable2;  // доступные операции: +, -, *, /, %
        System.out.println(intVariable3);

        intVariable3 = intVariable3 + 10;
//        intVariable3 += 10; // эквивалентно выражению: intVariable3 = intVariable3 + 10
        System.out.println(intVariable3);

        // Другие целочисленные типы данных
        byte byteVariable = 127;
        short shortVariable = 5438;
        long longVariable = 37588945;

        // Вещественные типы данных
        double doubleVariable = 234.75;
        float floatVariable = 3125.4f;

        /*
         Практика
         Easy: Написать преобразование метров в сантиметры
         Normal: Написать преобразование часов в секунды
         Hard: Написать преобразовнаие градусов Цельсия в градусы Фарангейта
         */

        char charVariable = 'a';    // целочисленный тип данных
        char charVariable2 = 97;
        System.out.println(charVariable2);

        char charVariable3 = (char) (charVariable + 1); // доступные операции: +, -, *, /, %
        System.out.println(charVariable3);

        // Логический тип данных
        boolean booleanVariable = true; // принимает либо true, либо false
        System.out.println(booleanVariable);

        boolean booleanVariable2 = 5 > 2; // доступные операции: >, <, >=, <=, ==, !=
        System.out.println(booleanVariable2);

        // Строковый тип данных
        String stringVariable = "Hello, ";
        String stringVariable2 = new String("world!");  // неэффективный способ создания строки

        String stringVariable3 = stringVariable + stringVariable2;  // доступные операции: +
        System.out.println(stringVariable3);
        System.out.println(stringVariable + "Java!");
        System.out.println("I am " + 15 + " years old");
        System.out.println(stringVariable3.length());
        System.out.println(stringVariable3.charAt(0));

        /*
         Практика
         Пробуем присвоить строковой переменной число и наоборот, проверяем целочисленное деление,
         делаем переполнение переменной и анализируем результаты
         */
    }
}
