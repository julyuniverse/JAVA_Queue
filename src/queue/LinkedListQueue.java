package queue;

import linkedlist.LinkedList;

interface Queue{
    public void enQueue(String data);
    public String deQueue();
    public void printAll();
}

public class LinkedListQueue extends LinkedList implements Queue {

    @Override
    public void enQueue(String data) {

    }

    @Override
    public String deQueue() {
        return null;
    }
}
