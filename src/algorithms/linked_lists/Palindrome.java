package algorithms.linked_lists;

//todo : do without extra memory
public class Palindrome extends LinkedList {

    private static boolean isPalindrome(Node head) {
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

}
