public class DynamicStack {

    int[] stack = new int[5];
    int index = -1;

    public boolean isEmpty() {
        return index == -1;
    }

    public int size() {
        return index + 1;
    }

    private boolean isFull() {
        return (index == stack.length - 1);
    }

    public void increaseCapacityOfStack() {
        int newCapacity = (int) ((stack.length * 2.5) + 1);
        System.out.println("New capacity of a Stack is : " + newCapacity);
        int[] newStack = new int[newCapacity];
//        for (int i = 0; i < stack.length; i++) newStack[i] = stack[i];
        System.arraycopy(stack, 0, newStack, 0, size());
        stack = newStack;
//        printStack();
    }

    // when stack have 3 elements then stack size should be change from 13 to 6
    private void shrinkStack() {
        System.out.println("Shrinking stack.....");
        System.out.println("Stack size is "+size());
        System.out.println("Stack length is "+stack.length);
        int newCapacity = stack.length / 2;
        int[] newStack = new int[newCapacity];
        System.arraycopy(stack, 0, newStack, 0, size());
        stack = newStack;
        System.out.println("Shrinking done! new stack capacity is "+ stack.length);
        printStack();
    }

    public void push(int i) {

        if (isFull()) {

            printStack();
            System.out.println("Stack is full! Increasing the size of stack by 2.5 times...");
            increaseCapacityOfStack();
            printStack();
        }
        stack[++index] = i;
//        System.out.println("index is at "+ index);
    }


    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Can not pop an element from stack");
            printStack();
        } else {
            int result = stack[index];
            System.out.println();
            stack[index] = 0;
            index--;
            if ((index + 1) == (int) (0.25 * stack.length)) shrinkStack();
            return result;
        }
        return 0;
    }


    public int peek() {
        return stack[index];
    }

    public void printStack() {
        if (isEmpty()) {
//            System.out.println("in empty block ans size is "+size());
            for (int i = 0; i < stack.length; i++) {
                System.out.println(i + " |    | ");
            }
        } else {
            for (int i = stack.length-1; i >= 0; i--) {
                if(i>index) System.out.println(i + " |    | ");
                if(i<=index) System.out.println(i + " | " + stack[i] + " | ");
            }
        }
        System.out.println("  ------");
        System.out.println();

    }
}
