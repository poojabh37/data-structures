package algorithms.stacks.problems;

import java.util.Scanner;
import java.util.Stack;

import static algorithms.stacks.problems.StackUtil.isMatchingBracket;
import static algorithms.stacks.problems.StackUtil.isOpenBracket;

public class InfixToPostfix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            String infix = sc.next();
            convertToPostfix(infix);
            System.out.println();
        }
    }

    private static void convertToPostfix(String infix) {
        Stack<Character> operators = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char exp = infix.charAt(i);
            if (isOperand(exp)) {
                System.out.print(exp);
            } else {
                if (isOpenBracket(exp) || isLowerPrecedenceInStack(exp, operators)) {
                    operators.push(exp);
                } else if (isOperator(exp) && !isLowerPrecedenceInStack(exp, operators)) {
                    while (!operators.isEmpty() && (!isLowerPrecedenceInStack(exp, operators) || !isOpenBracket(operators.peek()))) {
                        char c = operators.pop();
                        if (isOperator(c))
                            System.out.print(c);
                    }
                    operators.push(exp);
                } else if (isCloseBracket(exp)) {
                    while (!operators.isEmpty() && !isMatchingBracket(exp, operators.peek())) {
                        char c = operators.pop();
                        if (isOperator(c))
                            System.out.print(c);
                    }
                    operators.pop();  //pop open bracket
                }
            }
        }
        while (!operators.isEmpty())
            System.out.print(operators.pop());
    }

    private static boolean isOperand(char exp) {
        return (exp >= 'a' && exp <= 'z') ||
                (exp >= 'A' && exp <= 'Z');
    }

    private static boolean isCloseBracket(char exp) {
        return exp == ')' || exp == '}' || exp == ']';
    }

    private static boolean isLowerPrecedenceInStack(char exp, Stack<Character> operators) {
        if (!operators.isEmpty() && isOperator(exp)) {
            return getOperatorPrecedence(exp) > getOperatorPrecedence(operators.peek());
        } else return operators.isEmpty();
    }


    private static boolean isOperator(char exp) {
        return exp == '+' || exp == '-' || exp == '*' || exp == '/' || exp == '^';
    }

    private static int getOperatorPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
}
