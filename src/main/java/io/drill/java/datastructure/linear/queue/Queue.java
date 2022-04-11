package io.drill.java.datastructure.linear.queue;

import java.util.NoSuchElementException;

public class Queue<T> {
    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);

        if (last != null) {
            last.next = newNode;
        }

        last = newNode;

        if (first == null) {
            first = newNode;
        }
    }

    public T dequeue() {
        if (first == null) throw new NoSuchElementException();

        T item = first.data;
        first = first.next;

        if (first == null) {
            last = null;
        }

        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public T peek() {
        if (first == null) throw new NoSuchElementException();

        return first.data;
    }

    public String dump() {
        if (first == null) throw new NoSuchElementException();

        String dump = "";
        Node<T> item = first;

        while (item != null) {
            dump += "[" + item.data + "]";
            item = item.next;
        }

        return dump;
    }
}
