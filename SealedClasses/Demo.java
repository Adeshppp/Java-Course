
sealed class A extends Thread implements Cloneable permits B, C, D {

}

non-sealed class B extends A {

}

non-sealed class C extends A {

}

class P extends C {

}

final class D extends A {

}

public class Demo {
    public static void main(String[] args) {

    }
}
