package algorithms.linked_lists;

import java.util.Scanner;

public class LinkedList {

    Node start;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            // int data = sc.nextInt();
            list.insertEnd(i);
        }
        printList(list);
        list.middleElement();
        // list.deleteAfter(4);
        // printList(list);
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
        Node current = list.start;
        Node next;
        while (current != null && current.next != null) {
            next = current.next;
            while (next != null && current.data == next.data) {
                current.next = next.next;
                next = next.next;
            }
            current = current.next;
        }
    }

    private boolean isPalindrome(Node head) {
        int total = 1;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            total++;
        }

        int mid = total / 2;
        if (total % 2 == 1) {
            mid = mid + 1;
        }

        current = head;
        int arr[] = new int[total / 2];
        int count = 1;
        while (count <= mid) {
            if (count - 1 < arr.length) {
                arr[count - 1] = current.data;
            }
            current = current.next;
            count++;
        }
        count = arr.length - 1;
        while (current != null) {
            if (current.data != arr[count]) {
                return false;
            }
            current = current.next;
            count--;
        }
        return true;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
