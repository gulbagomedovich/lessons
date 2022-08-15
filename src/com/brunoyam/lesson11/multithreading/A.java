package com.brunoyam.lesson11.multithreading;

public class A implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from thread A");
    }
}
