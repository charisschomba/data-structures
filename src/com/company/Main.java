package com.company;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
       PriorityQueue queue = new PriorityQueue();
       queue.add(40);
       queue.add(30);
       queue.add(20);
        while (!queue.isEmpty())
            System.out.println(queue.remove());
    }
}
