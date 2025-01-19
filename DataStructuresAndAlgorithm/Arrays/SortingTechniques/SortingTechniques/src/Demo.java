public class Demo {
    public static void main(String[] args) {
        int[] nums = {6, 5, 2, 8, 9, 4};


        System.out.println("Before Sorting");
        for (int num : nums) System.out.print(num + " ");
        System.out.println();
        System.out.println();

//        nums = bubbleSort(nums);
//        nums = selectionSort(nums);
        nums = insertionSort(nums);

        System.out.println();
        System.out.println("After Sorting");
        for (int num : nums) System.out.print(num + " ");
    }

    public  static int[] insertionSort(int[] nums) {
        for(int i=1;i<nums.length;i++){
            int key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j]> key) nums[j+1] = nums[j--];
            nums[j+1] = key;
        }
        return nums;
    }

    public static int[] selectionSort(int[] nums) {
        System.out.println("Sorting by using Selection Sort");
        int minIndex = -1;
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
            for (int num : nums) System.out.print(num + " ");
            System.out.println();
        }
        return nums;
    }

    public static int[] bubbleSort(int[] nums) {
        System.out.println("Sorting by using BubbleSort Sort");
        int steps = 0;
        int size = nums.length;
        int temp = 0;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size - 1; j++) {
                steps++;
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println("Steps in bubble sort is " + steps);
        return nums;
    }
}
