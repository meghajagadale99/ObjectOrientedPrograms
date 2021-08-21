package com.bridgelabz.oops;
import java.util.List;
public class Stack<T> {
    Object[] stack = new Object[6];
    int top;

    public void push(Object data) {
        if (isFull()) {
            System.out.println("Stack is overflow");
        } else {
            stack[top] = data;
            top++;
        }

    }

    public void pushAll(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            push(list.get(i));
        }

    }

    public void pop() {

        if (isEmpty()) {
            System.out.println("Stack is underflow");
        } else {
            top--;
            stack[top] = 0;

        }

    }
    @SuppressWarnings("unchecked")
    public T peek() {
        T data;
        data = (T) stack[top - 1];
        return data;
    }

    public boolean isEmpty() {

        return top == 0;
    }

    public boolean isFull() {

        return top == stack.length;
    }

    public void show() {
        for (Object num : stack) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int size() {
        return top;
    }

}

