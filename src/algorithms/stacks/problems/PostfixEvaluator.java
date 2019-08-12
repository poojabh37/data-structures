package algorithms.stacks.problems;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String postFix = sc.next();
        int result = evaluatePostFix(postFix);
        System.out.println(result);
    }

    private static int evaluatePostFix(String postFix) {
        Stack<Integer> expStack = new Stack<>();
        for (int i = 0; i < postFix.length(); i++) {
            String current = Character.toString(postFix.charAt(i));
            if (isNumeric(current)) {
                expStack.push(Integer.parseInt(current));
            } else { //isOperator
                int right = expStack.pop();
                int left = expStack.pop();
                expStack.push(operate(current, left, right));
            }
        }
        return expStack.pop();
    }

    private static boolean isNumeric(String strNum) {
        try {
            Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    private static int operate(String operator, int left, int right) {
        switch (operator) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
        }
        return -1;
    }

}
