public class Main {
    public static void main(String[] args) {
//        Stack stack = new Stack();
        DynamicStack stack = new DynamicStack();
        stack.push(15);
        System.out.println("Size of stack is : "+stack.size());
        System.out.println("length of stack is : "+stack.stack.length);
        stack.printStack();
        stack.push(14);
        stack.printStack();
        stack.push(13);
        stack.printStack();
        System.out.println("Size of stack is : "+stack.size());
        stack.push(12);
        stack.printStack();
        stack.push(10);
        stack.printStack();
        stack.push(19);
        stack.printStack();
//        int popped = stack.pop();
//        System.out.println("Popped value from stack "+popped);
//        stack.printStack();
//        int peakedValue = stack.peek();
//        System.out.println("Peek value "+peakedValue);
//        System.out.println("Is stack empty ? "+stack.isEmpty());
//        System.out.println("Size of stack is : "+stack.size());
        System.out.println("Popped value from stack "+stack.pop());
        stack.printStack();
        System.out.println("Popped value from stack "+stack.pop());
        stack.printStack();
        System.out.println("Popped value from stack "+stack.pop());
        stack.printStack();
        System.out.println("Popped value from stack "+stack.pop());
        stack.printStack();
        System.out.println("Popped value from stack "+stack.pop());
        stack.printStack();
//        stack.pop();
//        stack.printStack();
//        System.out.println("Is stack empty ? "+stack.isEmpty());
//        System.out.println("Size of stack is : "+stack.size());
    }
}
