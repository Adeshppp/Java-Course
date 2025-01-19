package org.example;

import java.util.Arrays;

public class SortingArray {
    public int[] sortingArray(int[] nums){
        for(int i=0;i<1000000;i++){
            Arrays.sort(nums);
        }
        return nums;
    }
}
