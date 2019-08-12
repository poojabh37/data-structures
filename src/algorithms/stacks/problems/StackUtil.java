package algorithms.stacks.problems;

class StackUtil {

    static boolean isOpenBracket(char exp) {
        return exp == '(' || exp == '{' || exp == '[';
    }

    static boolean isMatchingBracket(char exp, char topOfStack) {
        return exp == ')' && topOfStack == '('
                || exp == ']' && topOfStack == '['
                || exp == '}' && topOfStack == '{';
    }

}
