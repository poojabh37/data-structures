package algorithms.linked_lists;

public class LinkedList {

    private Node start;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertStart(0);
        list.insertEnd(1);
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(4);
        list.insertEnd(5);
        list.insertEnd(6);
        printList(list);

        reverse(list);
        printList(list);

        reverseBetween(list, 5, 2);
        printList(list);
    }

    private static void reverseBetween(LinkedList list, int num1, int num2) {
        Node prev = null;
        Node current = list.start;
        Node next;
        while (current.data != num1) {
            prev = current;
            current = current.next;
        }
        Node reverseStart = prev;
        Node reverseEnd = current;

        while (current.data != num2) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        next = current.next;
        current.next = prev;
        reverseStart.next = current;
        reverseEnd.next = next;
    }

    private static void reverse(LinkedList list) {
        if (list.start == null) {
            System.out.println("Empty list");
        } else {
            Node current = list.start;
            Node prev = null;
            Node next;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            list.start = prev;
        }
    }

    private static void printList(LinkedList list) {
        if (list.start == null) {
            System.out.println("Empty list");
        } else {
            Node current = list.start;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("NULL");
        }
    }

    private void insertBefore(int data, int num) {
        Node newNode = new Node(data);

        Node ptr = start;
        while (ptr.next.data != num) {
            ptr = ptr.next;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
    }

    private void insertAfter(int data, int num) {
        Node newNode = new Node(data);

        Node ptr = start;
        while (ptr.next != null && ptr.data != num) {
            ptr = ptr.next;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
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

    private void insertEnd(int data) {
        Node newNode = new Node(data);
        if (start == null) {
            start = newNode;
        } else {
            Node last = start;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
