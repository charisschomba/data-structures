package com.company;

import javax.xml.stream.events.Characters;
import java.util.Stack;

public class StringReverser  {
    public String reverse(String input) {
        if(input == null)
            throw new NullPointerException();
        Stack<Character> stack = new Stack<>();
        for(char ch: input.toCharArray())
            stack.push(ch);
        StringBuffer reversed = new StringBuffer();
        while(!stack.isEmpty())
            reversed.append(stack.pop());
        return reversed.toString();
    }
}

