package com.company;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
       ArrayQueue queue = new ArrayQueue(5);
       queue.enqueue(10);
       queue.enqueue(20);
       queue.enqueue(30);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue.dequeue());
        queue.enqueue(70);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

    }
}
