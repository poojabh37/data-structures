package problems.school.strings;

import java.util.Scanner;
import java.util.Stack;

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
            char currentBrace = braces.charAt(i);
            if (isOpeningBrace(currentBrace)) {
                braceStack.push(currentBrace);
            } else {
                if (braceStack.isEmpty()) {
                    return false;
                }
                char topOfStack = braceStack.peek();
                if (isMatchingBraceFound(topOfStack, currentBrace)) {
                    braceStack.pop();
                } else {
                    break;
                }
            }
        }
        return i == braces.length() && braceStack.isEmpty();
    }

    private static boolean isOpeningBrace(char currentBrace) {
        return currentBrace == '[' ||
                currentBrace == '{' ||
                currentBrace == '(';
    }

    private static boolean isMatchingBraceFound(char topOfStack, char currentBrace) {
        return (topOfStack == '[' && currentBrace == ']') ||
                (topOfStack == '{' && currentBrace == '}') ||
                (topOfStack == '(' && currentBrace == ')');
    }

}