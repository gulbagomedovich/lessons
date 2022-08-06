package com.brunoyam.lesson7.abstractclasses;

public class Main {
    public static void main(String[] args) {
        /*Animal animal = new Animal();
        animal.weight = 2.5;
        animal.say();*/

        Dog dog = new Dog();
        dog.weight = 3.4;
        dog.say();

        Cat cat = new Cat();
        cat.weight = 3.1;
        cat.say();

        Duck duck = new Duck();
        duck.weight = 2.6;
        duck.say();
    }
}
