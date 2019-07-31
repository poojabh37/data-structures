package algorithms.stacks.implementations;

public class LinkedListStack implements Stack {

    private Node start;

    @Override
    public void push(int item) {
        insertStart(item);
    }

    private void insertStart(int data) {
        Node newNode = new Node(data);
        if (start == null) {
            start = newNode;
        } else {
            newNode.next = start;
            start = newNode;
        }
    }

    @Override
    public int pop() {
        return deleteStart();
    }

    private int deleteStart() {
        int data = start.data;
        start = start.next;
        return data;
    }

    @Override
    public int peek() {
        return getStartData();
    }

    @Override
    public boolean isEmpty() {
        return start == null;
    }

    private int getStartData() {
        return start.data;
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
