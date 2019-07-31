package algorithms.stacks.implementations;

public class LinkedListStack implements Stack {

    private Node top;

    @Override
    public void push(int item) {
        insertStart(item);
    }

    private void insertStart(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    @Override
    public int pop() {
        return deleteStart();
    }

    private int deleteStart() {
        int data = top.data;
        top = top.next;
        return data;
    }

    @Override
    public int peek() {
        return getStartData();
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    private int getStartData() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack");
        }
        return top.data;
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
