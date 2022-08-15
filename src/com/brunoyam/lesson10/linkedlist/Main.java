package com.brunoyam.lesson10.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addLast("B");
        linkedList.addLast("C");
        linkedList.addLast("D");
        linkedList.addLast("E");

        System.out.println("Linked list: " +  linkedList);

        linkedList.addFirst("A");

        System.out.println("Linked list: " +  linkedList);

        System.out.println("Index of element with value E: " + linkedList.get("E"));
        System.out.println("Index of element with value Z: " + linkedList.get("Z"));
    }
}
