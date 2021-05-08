package data_structure.stack;


public class Stack {

    private int maxSize;
    private int [] stackArray;
    private int top;

    // Constructor
    public Stack(int size) {

        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    // Stack Operations: push, pop, peak
    public void push (int item) {

        if (isFull()) {
            System.out.println("Stack is full, cant insert item: "+item);
        } else {
            top++;
            stackArray[top] = item;
        }
    }

    public Object pop() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int hold_top = top;
            top--;
            return stackArray[hold_top];
        }
    }

    public Object peak() {
        return stackArray[top];
    }

    public boolean isEmpty () {
        return (top == -1);
    }

    public boolean isFull () {
        return (top == maxSize-1);
    }

    public int getMin() {
        int minVale = stackArray[0];
        for (int i = 0; i < stackArray.length; i++) {
            if (minVale < stackArray[i]){
                minVale = stackArray[i];
            }
        }
        return minVale;
    }

}
