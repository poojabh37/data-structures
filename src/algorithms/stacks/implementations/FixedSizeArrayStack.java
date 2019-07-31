package algorithms.stacks.implementations;

class FixedSizeArrayStack implements Stack {
    private static final int CAPACITY = 5;
    private int capacity;
    private int[] stack;
    private int topIndex = -1;  //-1 indicates empty stack

    FixedSizeArrayStack() {
        this(CAPACITY);
    }

    FixedSizeArrayStack(int capacity) {
        stack = new int[capacity];
        this.capacity = capacity;
    }

    @Override
    public void push(int item) {
        topIndex++;
        if (isStackFull()) {
            throw new RuntimeException("Stack Overflow");
        }
        stack[topIndex] = item;
    }

    private boolean isStackFull() {
        return topIndex == capacity;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Empty");
        }
        int item = stack[topIndex];
        topIndex--;
        return item;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Empty");
        }
        return stack[topIndex];
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }
}

class TestStack {

    public static void main(String[] args) {
        FixedSizeArrayStack stack = new FixedSizeArrayStack(2);
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
