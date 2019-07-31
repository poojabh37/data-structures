package algorithms.stacks.implementations;

//follows LIFO (Last In First Out)
public interface Stack {

    //add new element on to the top of the stack
    void push(int item);

    //deletes and returns the top element
    int pop();

    //returns the top element
    int peek();

    boolean isEmpty();
}
