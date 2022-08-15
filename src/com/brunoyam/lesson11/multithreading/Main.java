package com.brunoyam.lesson11.multithreading;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        Thread threadA = new Thread(a);
        threadA.start();

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread B");
            }
        });
        threadB.start();

        Thread threadC = new Thread(() -> System.out.println("Hello from thread C"));
        threadC.start();

        D threadD = new D();
        threadD.start();

        System.out.println("Hello from main thread");

        if (threadD.isAlive()) {
            System.out.println("Thread D is alive");
        }

        try {
            threadD.join();
            System.out.println("After thread D");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        for (int i = 3; i >= 1; i--) {
            System.out.println("Программа завершится через: " + i + " сек");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
