package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class SortingArrayTest {

    @Test
    void sortingArray() {
        SortingArray sortingArray = new SortingArray();
        int[] unSorted = {2,5,1};
        assertTimeout(Duration.ofMillis(100),()->sortingArray.sortingArray(unSorted));
    }
}
