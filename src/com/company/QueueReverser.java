package com.company;

import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    public static void reverse(Queue<Integer> queue, int k) {
        if(k > 0 && k <= queue.size()) {
            Stack<Integer> stack = new Stack();
            int i;
            for(i = 0; i < k; ++i) {
                stack.push((Integer)queue.remove());
            }
            while(!stack.isEmpty())
                queue.add((Integer) stack.pop());
            for(i = 0; i < queue.size() - k; ++i) {
                queue.add((Integer)queue.remove());
            }
            System.out.println(queue);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
