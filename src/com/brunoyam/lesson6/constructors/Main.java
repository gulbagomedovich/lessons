package com.brunoyam.lesson6.constructors;

public class Main {
    public static void main(String[] args) {
        // Человек должен иметь имя и возраст
//        Person person = new Person();
//        Person person = new Person("Вася");
        Person person = new Person("Вася", 35);

//        person.setName("Вася");
//        person.setAge(35);

        System.out.printf("Привет! Меня зовут %s, мне %d лет\n", person.getName(), person.getAge());
    }
}
