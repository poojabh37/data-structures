package algorithms.stacks.problems;

import java.util.Scanner;
import java.util.Stack;

import static algorithms.stacks.problems.StackUtil.isMatchingBracket;
import static algorithms.stacks.problems.StackUtil.isOpenBracket;

public class ParenthesisChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String braces = sc.next();
        if (isBalanced(braces)) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }

    private static boolean isBalanced(String braces) {
        Stack<Character> braceStack = new Stack<>();
        int i;
        for (i = 0; i < braces.length(); i++) {
            char current = braces.charAt(i);
            if (isOpenBracket(current)) {
                braceStack.push(current);
            } else {
                if (braceStack.isEmpty()) {
                    return false;
                }
                if (isMatchingBracket(braceStack.peek(), current)) {
                    braceStack.pop();
                } else {
                    return false;
                }
            }
        }
        return braceStack.isEmpty();
    }

}
