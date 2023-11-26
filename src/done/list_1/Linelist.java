package ru.mirea.kabo0122.list_1;

public class Linelist {
    private Node head;

    public void insertFirst(int data, String fn, String ln) {
        Node newNode = new Node();
        newNode.age = data;
        newNode.first_name = fn;
        newNode.last_name = ln;
        newNode.next = head;
        head = newNode;
    }

    public void deleteLast() {
        Node current = head;
        Node temp = head;
        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        current = temp;
        current.next = null;
    }
    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            current.toString();
            current = current.next;

        }
        System.out.print("NULL");

    }
}