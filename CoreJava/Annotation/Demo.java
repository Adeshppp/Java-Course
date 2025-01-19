class A {
    public void showData() {
        System.out.println("This is A class");
    }
}

class B extends A {
    @Override
    public void showsData() {
        System.out.println("This is B class");
    }
}

public class Demo {
    public static void main(String[] args) {
        B b = new B();
        b.showData();
    }
}
