package CoreJava.Other;

class A {
    public A() {
        System.out.println("A constructor");
    }

    public A(int n) {
        this();
        System.out.println("A paramerized constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("B constructor");
    }

    public B(int n) {
        this();

        // super(n);
        System.out.println("B paramerized constructor");
    }
}

public class ThisAndSuperMethod {
    public static void main(String[] args) {
        B obj = new B(3);
    }
}
