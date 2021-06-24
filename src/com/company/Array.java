package com.company;

import java.util.ArrayList;

public class Array {
    private int[] items;
    private int count;
    public Array(int length) {
        items = new int[length];
    }
    private void resizeRequired () {
        if(items.length == count) {
            int[] newItems = new int[count * 2];
            for(int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
    }
    public void insert (int item) {
       resizeRequired();
        items[count++] = item;
    }
    public void removeAt (int index) {
        if(index < 0 || index >= count)
            throw  new IllegalArgumentException();
        for(int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }
    public int indexOf (int item) {
         for(int i = 0; i < count; i++)
             if(items[i] == item)
                 return i;
         return  -1;
    }
    public int max() {
        int max = 0;
        for(int i = 0; i < count; i++) {
            if(items[i] > max)
                max = items[i];
        }
        return max;
    }
    public ArrayList<Integer> intersect (int[] arr) {
        ArrayList<Integer> common = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            if(items[i] == arr[i])
                common.add(items[i]);
        }
        return common;
    }
    public void reverse() {
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = items[count - i - 1];
        }
        items = reversed;
    }
    public void insertAt(int item, int index) {
        if(index < 0 || index >= items.length)
            throw  new IllegalArgumentException();
        resizeRequired();
        for (int i = count - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }
        items[index] = item;
        count++;
        }
    public void print () {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}
