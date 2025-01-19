
final class Calc {
    public void show() {
        System.out.println("by Adesh");
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class AdvxCalc extends Calc {
    public void show() {
        System.out.println("by John");
    }
}

public class Demo {
    public static void main(String[] args) {
        AdvxCalc obj = new AdvxCalc();
        obj.show();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}
