package com.brunoyam.lesson6.constructors;

public class Person {
    private String name;
    private int age;

    Person() {
        System.out.println("Hello from constructor without parameters");

        this.name = "Безымянный";
        this.age = 0;
    }

    Person(String name) {
        System.out.println("Hello from constructor with one parameter");

        this.name = name;
        this.age = 0;
    }

    Person(String name, int age) {
        System.out.println("Hello from constructor with two parameters");

        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }
}
