package com.brunoyam.lesson5;

/*
 Java-файл может содержать только 1 класс с public.
 Имя этого класса должно совпадать с именем файла.
 */
public class Classes {
    public static void main(String[] args) {
        // Объявили ссылочную переменную типа Person, содержащую ссылку на новый объект класса Person
        Person person = new Person();
//        person.name = "Иван";
//        person.setName("Иван");
//        person.age = 30;
//        person.setAge(30);
        person.setNameAndAge("Иван", 30);

//        System.out.println("Меня зовут " + person.name + ", мне " + person.age + " лет");
//        System.out.printf("Меня зовут %s, мне %d лет\n", person.name, person.age);
//        System.out.printf("Меня зовут %s, мне %d лет\n", person.getName(), person.getAge());

        person.sayHello();
        person.speak();

        /*Person person2 = new Person();
//        person2.name = "Виталий";
        person2.setName("Виталий");
        person2.age = 20;
//        System.out.printf("Меня зовут %s, мне %d лет", person2.name, person2.age);
        person2.sayHello();
        person2.speak();*/

        int yearsToRetirement = person.calculateYearsToRetirement();
        System.out.printf("Осталось до пенсии %d лет\n", yearsToRetirement);

        /*
         Практика
         Напишите класс Student, предоставляющий информацию об имени студента методом getName()
         и о его курсе методом getCourse()
         */

        /*
         Практика
         Класс Phone.
         1. Создайте класс Phone, который содержит переменные number, model и weight.
         2. Создайте три экземпляра этого класса.
         3. Выведите на консоль значения их переменных.
         4. Добавить в класс Phone методы:
         - receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
         - getNumber – возвращает номер телефона.
         Вызвать эти методы для каждого из объектов.
         */
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("Hello from class Test");
    }
}

class Test2 {
    public static void main(String[] args) {
        System.out.println("Hello from class Test2");
    }
}

class Person {
    // Свойства
    String name;
    int age;

    // Поведение, то есть методы
    void speak() {
        System.out.printf("Меня зовут %s, мне %d лет\n", name, age);
    }

    void sayHello() {
        System.out.println("Привет!");
    }

    int /*void*/ calculateYearsToRetirement() { // void - ничего не возвращает, int - возвращает целое число
//        int yearsToRetirement = 65 - age;
//        System.out.printf("Осталось %d лет до пенсии\n", yearsToRetirement);
        return 65 - age;    // возвращаемый тип метода int, поэтому вернем int с помощью return
//        return "Hello"; // ошибка, метод возврашает целое число
//        System.out.println();   // ошибка, после return метод больше не выполняется
    }

    void setName(String n) {
        name = n;
    }

    void setAge(int a) {
        age = a;
    }

    void setNameAndAge(String n, int a) {
        name = n;
        age = a;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}
