package com.company;

public class Main {
    public static void main(String[] args) {
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.enqueue(10);
        linkedListQueue.enqueue(20);
        linkedListQueue.enqueue(30);
        linkedListQueue.enqueue(40);
        linkedListQueue.enqueue(50);
        linkedListQueue.enqueue(60);
        System.out.println(linkedListQueue.toString());
        linkedListQueue.dequeue();
        System.out.println(linkedListQueue.toString());
        System.out.println(linkedListQueue.peek());
        System.out.println(linkedListQueue.isEmpty());
        System.out.println(linkedListQueue.size());
    }
}
