public class Stack {

    int[] stack = new int[5];
    int index = -1;

    public boolean isEmpty() {
        return index == -1;
    }

    public int size() {
        return index + 1;
    }

    public void push(int i) {

        if (index == stack.length - 1) {
            System.out.println("Stack is full! Can not add element " + i + " to stack");
            printStack();
            return;
        }
        stack[++index] = i;
//        System.out.println("index is at "+ index);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Can not pop an element from stack");
            printStack();
        } else{
            int result = stack[index];
            System.out.println();
            stack[index] = 0;
            index--;
            return result;
        }
        return 0;
    }

    public int peek() {
        return stack[index];
    }

    public void printStack() {
        if(isEmpty()){
//            System.out.println("in empty block ans size is "+size());
            for (int i = 0; i <stack.length; i++) {
                System.out.println(i + " |    | ");
            }
        }
        else {
            for (int i = index; i >= 0; i--) {
                System.out.println(i + " | " + stack[i] + " | ");
            }
        }
            System.out.println("  ------");
            System.out.println();

    }
}
