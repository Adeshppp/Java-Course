
class A {
    int age;
    public String name;

    public void configure() {
        System.out.println("Configure method called");
    }
}

public class Demo {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void configure() {
                System.out.println("Configure method called by implementing anonymous inner class");
            }
        };
        a.configure();
    }
}
