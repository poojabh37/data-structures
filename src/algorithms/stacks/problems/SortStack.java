package algorithms.stacks.problems;

import java.util.Stack;

import static java.lang.Integer.MIN_VALUE;

public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(45);
        s.push(4);
        s.push(36);
        s.push(72);
        s.push(18);

        Stack<Integer> sorted = sort(s);
        while (!sorted.isEmpty()) {
            System.out.println(sorted.pop());
        }
    }

    private static Stack<Integer> sort(Stack<Integer> s) {
        if (s.size() > 1) {
            Stack<Integer> sorted = new Stack<>();
            sorted.push(s.pop());
            while (!s.isEmpty()) {
                if (!sorted.isEmpty()) {
                    int topSorted = sorted.peek();
                    int topS = s.pop();
                    Stack<Integer> greater = new Stack<>();
                    while (topSorted > topS) {
                        greater.push(sorted.pop());
                        topSorted = sorted.isEmpty() ? MIN_VALUE : sorted.peek();
                    }
                    sorted.push(topS);
                    while (!greater.isEmpty()) {
                        sorted.push(greater.pop());
                    }
                }
            }
            return sorted;
        }
        return s;
    }

    private static Stack<Integer> sortRecursive(Stack<Integer> s) {
        return null;
    }
}
