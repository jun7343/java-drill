package io.drill.java.datastructure.linear.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<T> {
    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> header;
    private int size = 0;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        size++;

        if (header == null) {
            header = newNode;
            return;
        }

        Node<T> end = header;

        while (end.next != null) {
            end = end.next;
        }

        end.next = newNode;
    }

    public void add(int index, T data) {
        // size 크기와 같은 index 에 add 가능
        if (index > size || index < 0) throw new IndexOutOfBoundsException();

        Node<T> newNode = new Node<>(data);
        size++;

        Node<T> item = header;
        int cnt = 0;

        // index 이전 Node item search
        while (cnt < index - 1) {
            item = item.next;
            cnt++;
        }

        newNode.next = item.next;
        item.next = newNode;
    }

    public T get(int index) {
        // size 크기와 같은 index 는 null 값 이기에 접근 불가
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        if (header == null) throw new NoSuchElementException();

        Node<T> item = header;
        int cnt = 0;

        while (cnt < index) {
            item = item.next;
            cnt++;
        }

        return item.data;
    }

    public String dump() {
        if (header == null) throw new NoSuchElementException();

        String result = "";
        Node<T> item = header;

        while (item != null) {
            result += "[" + item.data + "]";

            item = item.next;
        }

        return result;
    }

    public void removeFirst() {
        if (header == null) throw new NoSuchElementException();

        Node<T> item = header.next;

        header.next = null;
        header.data = null;
        header = item;
    }

    public void removeLast() {
        if (header == null) throw new NoSuchElementException();

        // 머리 노드 하나만 존재시 removeFirst
        if (header.next == null) {
            removeFirst();
            return;
        }

        Node<T> item = header;

        // 마지막 노드의 이전 노드 search
        while (item.next.next != null) {
            item = item.next;
        }

        // 마지막 노드 데이터 삭제 마지막 노드 참조 삭제
        item.next.data = null;
        item.next = null;
    }

    public int getSize() {
        return size;
    }
}
