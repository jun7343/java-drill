package io.drill.java.datastructure.linear;

import java.util.EmptyStackException;

public class Stack<T> {
    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);

        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (top == null) throw new EmptyStackException();

        T item = top.data;
        top = top.next;

        return item;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String dump() {
        if (top == null) throw new EmptyStackException();

        String result = "";
        Node<T> item = top;

        while (item != null) {
            result += "[" + item.data + "]";
            item = item.next;
        }

        return result;
    }
}
