package io.drill.java.datastructure.nonlinear;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    class Node {
        int data;
        LinkedList<Node> adjacent;
        boolean marked;

        Node(int data) {
            this.data = data;
            adjacent = new LinkedList<>();
            marked = false;
        }
    }

    Node[] nodes;
    StringBuilder sb = new StringBuilder(); // dfs, bfs 결과 호출용 builder

    Graph(int size) {
        nodes = new Node[size + 1]; // 보통 노드 값은 1부터 시작하기에 + 1 한다.

        for (int i = 0; i <= size; i++) {
            nodes[i] = new Node(i);
        }
    }

    public void addEdge(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if (! n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }

        if (! n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    public void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<>();

        root.marked = true;
        stack.push(root);

        while (! stack.isEmpty()) {
            Node r = stack.pop();

            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    stack.push(n);
                }
            }

            sb.append(String.format("[%d]", r.data));
        }

        System.out.println(sb.toString());  // 결과 출력
        sb = new StringBuilder(); // 결과값 초기화
        markedInitial();
    }
    
    // index 메개변수값이 없을 경우 1부터 시작
    public void dfs() {
        dfs(1);
    }

    // DFS Recursion
    public void dfsR(int index) {
        Node r = nodes[index];

        if (r == null) return;

        r.marked = true;
        System.out.print(String.format("[%d]", r.data));

        for (Node n : r.adjacent) {
            if (n.marked == false) {
                dfsR(n.data);
            }
        }
    }

    public void dfsR() {
        dfsR(1);
    }

    public void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new LinkedList<>();

        root.marked = true;
        queue.offer(root);

        while (! queue.isEmpty()) {
            Node r = queue.poll();

            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    queue.offer(n);
                }
            }
            
            sb.append(String.format("[%d]", r.data)); 
        }

        System.out.println(sb.toString());
        sb = new StringBuilder(); // 결과값 초기화
        markedInitial();
    }

    public void bfs() {
        bfs(1);
    }

    private void markedInitial() {
        for (Node n : nodes) {
            n.marked = false;
        }
    }
}
