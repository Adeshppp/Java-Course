public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(15);
        stack.push(14);
        stack.push(13);
        stack.push(12);
        stack.push(10);
//        stack.printStack();
        stack.push(19);
//        stack.printStack();
//        int popped = stack.pop();
//        System.out.println("Popped value from stack "+popped);
//        stack.printStack();
//        int peakedValue = stack.peek();
//        System.out.println("Peek value "+peakedValue);
//        stack.printStack();
//        System.out.println("Is stack empty ? "+stack.isEmpty());
//        System.out.println("Size of stack is : "+stack.size());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
//        System.out.println("Is stack empty ? "+stack.isEmpty());
//        System.out.println("Size of stack is : "+stack.size());
    }
}
