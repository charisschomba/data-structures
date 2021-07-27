package com.company;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class ArrayQueue {
    private int[] items;
    private int rear;
    private int front;

    private int count = 0;
    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }
    public void enqueue(int item) {
        if(count == items.length)
            throw new IllegalStateException();
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }
    public int dequeue () {
       var item = items[front];
       items[front] = 0;
       front = (front + 1) % items.length;
       count--;
       return item;
    }
    public int peek () {
       return items[front];
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public boolean isFull() {
        return count == items.length;
    }
    public static void reverse(Queue<Integer> queue) {
        java.util.Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty())
            stack.push(queue.remove());
        while(!stack.isEmpty())
            queue.add(stack.pop());
    }
    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
