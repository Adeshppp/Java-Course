import java.util.ArrayList;

public class Demo {
    // var num = 189; // not allowed

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        var list1 = new ArrayList();

        int a = 9;
        var b = 7;
        System.out.println(b);

        int c;
        var d = 10;

        int[] nums = new int[5];
        // var nums1[] = new int[5]; // not allowed
        var nums1 = new int[5];
    }
}

// class var{} // not allowed
