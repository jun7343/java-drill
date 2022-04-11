package io.drill.java.datastructure.nonlinear.tree;

public class BinaryTree<T> {
    private class Node<T> {
        private T data;
        private Node<T> left;
        private Node<T> right;

        public Node(T data) {
            this.data = data;
        }

        public T getLeft() {
            return left.data;
        }

        public T getRight() {
            return right.data;
        }
    }

    private Node<T> root;

    public BinaryTree(T data) {
        root = new Node<>(data);
    }

    public T getRoot() {
        return root.data;
    }

    public void setRoot(T data) {
        root = new Node<>(data);
    }

    public T getLeft() {
        return root.left.data;
    }

    public T getRight() {
        return root.right.data;
    }
}
