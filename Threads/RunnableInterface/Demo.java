// class A implements Runnable {

//     @Override
//     public void run() {
//         // TODO Auto-generated method stub
//         for (int i = 0; i < 10; i++)
//             System.out.println("Hi");
//         try {
//             Thread.sleep(1);
//         } catch (InterruptedException e) {
//             System.out.println("Error");
//         }

//     }

// }

// class B implements Runnable {

//     @Override
//     public void run() {
//         // TODO Auto-generated method stub
//         for (int i = 0; i < 10; i++)
//             System.out.println("Hello");
//         try {
//             Thread.sleep(1);
//         } catch (InterruptedException e) {
//             System.out.println("Error");
//         }

//     }

// }

// public class Demo {
// public static void main(String[] args) {
// Runnable obj1 = new A();
// Runnable obj2 = new B();
// Thread t1 = new Thread(obj1);
// Thread t2 = new Thread(obj2);
// t1.start();
// t2.start();
// }
// }

public class Demo {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++)
                System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Error" + e);
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 10; i++)
                System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Error" + e);
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
