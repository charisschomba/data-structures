package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var list  = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(40);
//        System.out.println(list.indexOf(300));
//        list.removeFirst();
//        list.removeLast();
//        System.out.println(list.size());
//        System.out.println(list.contains(10));
        System.out.println(Arrays.toString(list.toArray()));
      }
}