package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SortingArrayTest_Exception {

    @Test
    void sortingArray() {

//        try{
            SortingArray array = new SortingArray();
//            int[] unSortedArray = {5,4,3,2};
            int[] unSortedArray = null;
//        int[] sortedArray = sortingArray.sortingArray(unSortedArray);
////            int[] sortedArray = sortingArray.sortingArray(unSortedArray);
////        for(int i: sortedArray) System.out.println(i);
//            fail();
//        }
//        catch(NullPointerException e){
//            System.out.println("Exception generated!!!");
//        }

        assertThrows(NullPointerException.class,()->array.sortingArray(unSortedArray));

    }
}
