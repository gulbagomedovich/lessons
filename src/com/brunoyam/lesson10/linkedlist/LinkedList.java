package com.brunoyam.lesson10.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;

    public void addFirst(Object value) {
        Node firstNode = new Node(value);

        firstNode.setNext(head);

        if (head != null) {
            head.setPrev(firstNode);
        }

        head = firstNode;

        if (tail == null) {
            tail = firstNode;
        }
    }

    public void addLast(Object value) {
        Node lastNode = new Node(value);

        lastNode.setPrev(tail);

        if (tail != null) {
            tail.setNext(lastNode);
        }

        tail = lastNode;

        if (head == null) {
            head = lastNode;
        }
    }

    public int get(Object value) {
        Node currentNode = head;

        if (currentNode == null) {
            return -1;
        }

        if (currentNode.getValue().equals(value)) {
            return 0;
        }

        int index = 1;
        Node nextNode = currentNode.getNext();
        while (nextNode != null) {
            if (nextNode.getValue().equals(value)) {
                return index;
            }

            index++;
            nextNode = nextNode.getNext();
        }

        return -1;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
