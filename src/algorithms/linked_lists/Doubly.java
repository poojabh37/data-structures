package algorithms.linked_lists;

public class Doubly {
    public DoublyNode head;
    public DoublyNode tail;

    public static void main(String[] args) {
        Doubly doubly = new Doubly();
        doubly.insertNode(1);
        doubly.insertNode(2);
        doubly.insertNode(3);
        doubly.insertNode(5);

        printDoublyLinkedList(doubly.head);

        sortedInsert(doubly.head, 6);
        printDoublyLinkedList(doubly.head);
    }

    static DoublyNode sortedInsert(DoublyNode head, int data) {
        DoublyNode neww = new DoublyNode(data);
        if (head == null) {
            head = neww;
        }
        if (neww.data < head.data) {
            neww.next = head;
            head.prev = neww;
            head = neww;
        } else {
            DoublyNode current = head;
            while (current.next != null && current.data < data) {
                current = current.next;
            }
            if (current.next == null) {
                neww.prev = current;
                current.next = neww;
            }
            if (current != null && current.prev != null) {
                neww.prev = current.prev;
                neww.next = current;
                current.prev.next = neww;
                current.prev = neww;
            }

        }
        return head;

    }

    public static void printDoublyLinkedList(DoublyNode node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("NULL");
    }

    private void insertNode(int nodeData) {
        DoublyNode node = new DoublyNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }

        this.tail = node;
    }
}

class DoublyNode {
    int data;
    DoublyNode prev;
    DoublyNode next;

    DoublyNode(int data) {
        this.data = data;
    }
}
