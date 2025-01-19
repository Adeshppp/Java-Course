
class A {
    int age;
    public String name;

    public void configure() {
        System.out.println("Configure A");
    }

    class B {
        public void configure() {
            System.out.println("Configure B");
        }
    }

    static class C {
        public void configure() {
            System.out.println("Configure C");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        a.configure();
        System.out.println();

        A.B b = a.new B();
        b.configure();

        A.C c = new A.C();
        c.configure();
    }
}
