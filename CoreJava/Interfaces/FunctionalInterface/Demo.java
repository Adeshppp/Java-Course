// Functional interface : Single abstract Method (SAM)
@FunctionalInterface
interface A {
    void show(int i);
}

@FunctionalInterface
interface B {
    int add(int i, int j);
}

// class B implements A {

// @Override
// public void show() {
// System.out.println("Hello");
// }
// }

public class Demo {
    public static void main(String[] args) {
        // A a = new A() {
        // public void show() {
        // System.out.println("Hello");
        // }
        // };
        // A a = () -> System.out.println("Hello "); // lambda expression
        A a = i -> System.out.println("Hello " + i); // lambda expression
        a.show(7);

        B b = (i, j) -> i + j;
        System.out.println("Addition is " + b.add(23, 24));
    }
}
