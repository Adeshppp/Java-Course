
class A {
    public void print() throws ClassNotFoundException {
        // try {
        // System.out.println(Class.forName("Demo"));
        // } catch (ClassNotFoundException e) {
        // System.out.println("Class not found: " + e);
        // }

        System.out.println(Class.forName("calc"));

    }
}

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        try {
            a.print();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e);
            e.printStackTrace();
        }

    }
}
