package com.brackets;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    // Add an element to the top of the stack
    public void push(T element) {
        list.add(element);
    }

    // Remove the top element from the stack and return it
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

    // Return the top element of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    // Return true if the stack is empty, false otherwise
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
