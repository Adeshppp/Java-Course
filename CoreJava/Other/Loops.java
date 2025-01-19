package CoreJava.Other;

public class Loops {
    public static void main(String[] args) {
        int i=0;
        for(;i<10;){
            System.out.println(i++);
            // i++;
        }

        int nums[] = new int[4];
        nums[0]=4;
        nums[1]=8;
        nums[2]=3;
        nums[3]=9;
        //Enhanced for loop
        for(int n : nums) {
            System.out.println(n);
        }
    }
}
