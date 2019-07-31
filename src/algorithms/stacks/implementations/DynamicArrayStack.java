package algorithms.stacks.implementations;

public class DynamicArrayStack implements Stack {

    private int topIndex = -1;
    private int[] stack;

    public DynamicArrayStack() {
        stack = new int[1];
    }

    @Override
    public void push(int item) {
        topIndex++;
        if (isFull()) {
            createDoubleCapacityStack();
        }
        stack[topIndex] = item;
    }

    @Override
    public int pop() {
        int item = peek();
        topIndex--;
        return item;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack");
        }
        return stack[topIndex];
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    private boolean isFull() {
        return topIndex + 1 == stack.length;
    }

    private void createDoubleCapacityStack() {
        int newCapacity = 2 * stack.length;
        stack = new int[newCapacity];
    }
}

class TestDynamicArrayStack {

    public static void main(String[] args) {
        DynamicArrayStack stack = new DynamicArrayStack();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        stack.push(-1);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
