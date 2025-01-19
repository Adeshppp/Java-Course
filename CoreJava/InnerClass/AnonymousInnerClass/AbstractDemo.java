
abstract class A {
    abstract void show();
}

public class AbstractDemo {
    public static void main(String[] args) {
        A a = new A() {
            void show() {
                System.out.println("Hello");
            }
        };
        a.show();
    }
}
