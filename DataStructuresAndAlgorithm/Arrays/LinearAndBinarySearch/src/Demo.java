
public class Demo {
    public static void main(String[] args) {
        int nums[] = new int[1000];
//        int nums[] = {1, 3, 5, 6, 7, 9,11,12,13,14,19,200};
        int target = 900;

        int result = binarySearch(nums, target);
        int result1 = linearSearch(nums, target);

        if (result != -1) System.out.println("Element found at Index : " + result);
        else System.out.println("Element not found!");
    }

    public static int binarySearch(int[] nums, int target) {
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("Steps taken by Binary search : " + steps);
                return mid;
            } else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println("Steps taken by Binary search : " + steps);
        return -1;
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken by Linear search : " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by Linear search : " + steps);
        return -1;
    }
}
