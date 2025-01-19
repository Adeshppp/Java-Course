package CoreJava.Threads.ThreadClass;
// class A extends Thread {

//     public void show() {
//         for (int i = 0; i < 100; i++)
//             System.out.println("Hi");
//     }
// }

// class B extends Thread {
//     public void show() {
//         for (int i = 0; i < 100; i++)
//             System.out.println("Hello");
//     }
// }
class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println("Hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println("Hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        // a.show();
        // b.show();

        a.setPriority(Thread.MIN_PRIORITY);
        b.setPriority(Thread.MAX_PRIORITY);
        System.out.println("a THREAD PRIORITY: " + a.getPriority());
        System.out.println("B THREAD PRIORITY: " + b.getPriority());
        a.start();
        b.start();
    }
}
