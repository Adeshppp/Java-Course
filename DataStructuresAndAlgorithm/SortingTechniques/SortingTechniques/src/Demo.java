public class Demo {
    public static void main(String[] args) {
        int[] nums = {6,5,2,8,9,4,6,3};


        System.out.println("Before Sorting");
        for(int num :nums) System.out.print(num+" ");
        System.out.println();

        nums = bubbleSort(nums);

        System.out.println();
        System.out.println("After Sorting");
        for(int num :nums) System.out.print(num+" ");
    }

    public static int[] bubbleSort(int[] nums) {
        int steps = 0;
        int size = nums.length;
        int temp = 0;
        for(int i=0;i<size;i++){

            for(int j=0;j<size-1;j++){
                steps++;
                if(nums[j]> nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        System.out.println("Steps in bubble sort is "+steps);
        return nums;
    }
}
