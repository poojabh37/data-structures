package algorithms.linked_lists;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LinkedList {

    Node start;

    public static void main(String[] args) {
        NthFromTheEnd list = new NthFromTheEnd();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            list.insertEnd(i);
        }
        printList(list);
        int n = sc.nextInt();
        list.nthFromThEnd(n);
        list.removeNthFromEnd(n);
        printList(list);
//        Node a = new Node(1);
//        list.start = a;
//        Node b = new Node(2);
//        list.start.next = b;
//        Node c = new Node(3);
//        list.start.next.next = c;
//        Node d = new Node(4);
//        list.start.next.next.next = d;
//        list.start.next.next.next.next = list.start;
//
//        boolean has = list.hasLoop();
//        System.out.println(has);
    }

    static void printList(LinkedList list) {
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

    void insertStart(int data) {
        Node newNode = new Node(data);
        if (start == null) {
            start = newNode;
        } else {
            newNode.next = start;
            start = newNode;
        }
    }

    void insertEnd(int data) {
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

    private void insertAfter(int data, int num) {
        Node newNode = new Node(data);

        Node ptr = start;
        while (ptr.next != null && ptr.data != num) {
            ptr = ptr.next;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
    }

    private void insertBefore(int data, int num) {
        Node newNode = new Node(data);
        if (start.data == num) {
            newNode.next = start;
            start = newNode;
        } else {
            Node ptr = start;
            while (ptr.next != null && ptr.next.data != num) {
                ptr = ptr.next;
            }
            newNode.next = ptr.next;
            ptr.next = newNode;
        }
    }

    private static void deleteList(LinkedList list) {
        list.start = null;
    }

    private static void deleteStart(LinkedList list) {
        list.start = list.start.next;
    }

    private void deleteEnd() {
        Node current = start;
        if (start.next == null) {
            start = null;
            return;
        }
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    private void deleteNode(int num) {
        if (start.data == num) {
            start = start.next;
        } else {
            Node current = start;
            while (current.next != null && current.next.data != num) {
                current = current.next;
            }
            if (current.next != null) {  //if node not present
                current.next = current.next.next;
            }
        }
    }

    private void deleteBefore(int num) {
        Node current = start;
        Node prev = start;
        if (start.next.data == num) {
            start = start.next;
        }
        while (current.next != null && current.next.data != num) {
            prev = current;
            current = current.next;
        }
        if (current.next != null) {  //if num is not present or num is at start
            prev.next = current.next;
        }
    }

    private void deleteAfter(int num) {
        Node current = start;
        while (current != null && current.data != num) {
            current = current.next;
        }
        if (current != null && current.next != null) { //if num is last node or not present
            current.next = current.next.next;
        }
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
        if (reverseStart != null) {
            reverseStart.next = current;
        }
        reverseEnd.next = next;
    }

    Node middleElement() {
        Node slow = start;
        Node fast = start;
        while (fast.next != null) {
            fast = fast.next;
            if (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        System.out.println(slow.data);
        return slow;
    }

    private static void removeDuplicatesSorted(LinkedList list) {
        Node prev = null;
        Node deleted = null;
        Node current = list.start;
        Node next;
        while (current != null && current.next != null) {
            next = current.next;
            while (next != null && current.data == next.data) {
                deleted = next;
                current.next = next.next;
                next = next.next;
            }
            if (deleted != null && deleted.data == list.start.data) {
                list.start = list.start.next;
            }

            if (prev != null && deleted != null && deleted.data == current.data) {
                prev.next = next;
            } else {
                prev = current;
            }
            current = current.next;
        }
    }

    private void removeDuplicates() {
        Set<Integer> nums = new HashSet<>();
        Node current = start;
        Node prev = null;
        while (current != null) {
            if (!nums.contains(current.data)) {
                nums.add(current.data);
                prev = current;
            } else {
                prev.next = current.next;
            }
            current = current.next;
        }
    }

    //hare turtle
    private boolean hasLoop() {
        Node slow = start;
        Node fast = start;
        int count = 0;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count++;
            if (slow == fast) {
                System.out.println(count);
                return true;
            }
        }
        System.out.println(count);
        return false;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
