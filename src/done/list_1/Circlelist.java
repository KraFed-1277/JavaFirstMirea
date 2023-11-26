package ru.mirea.kabo0122.list_1;

public class Circlelist {
    private Circlenode head = null;
    private Circlenode tail = null;

    public void addNode(int value) {
        Circlenode newNode = new Circlenode(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
        }

        tail = newNode;
        tail.nextNode = head;
    }

}
