import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(5);
        nums.add(3);
        nums.add(8);
        nums.add(1);
        for (int num : nums)
            System.out.print(num + " ");
        // System.out.println(nums);
    }
}
