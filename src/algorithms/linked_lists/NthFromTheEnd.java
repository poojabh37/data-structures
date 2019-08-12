package algorithms.linked_lists;

public class NthFromTheEnd extends LinkedList {

    void nthFromThEnd(int n) {
        Node ref = start;
        Node main = start;
        int length = 1;
        while (length <= n && ref != null) {
            ref = ref.next;
            length++;
        }
        while (ref != null && main != null) {
            main = main.next;
            ref = ref.next;
            length++;
        }
        if (length < n) {
            System.out.println(-1);
            return;
        }
        System.out.println(main.data);
    }

    void removeNthFromEnd(int n) {
        Node mainPrev = null;
        Node ref = start;
        Node main = start;
        int length = 1;
        while (length < n && ref != null) {
            ref = ref.next;
            length++;
        }
        if (ref == null) { //delete 1st
            start = start.next;
            return;
        }
        while (main != null && ref != null) {
            mainPrev = main;
            main = main.next
            ;
            ref = ref.next;
            length++;
        }
        if (length < n) {
            start = start.next;
        } else if (length > n && mainPrev != null && main != null) {
            mainPrev.next = main.next;
        }
    }
}
