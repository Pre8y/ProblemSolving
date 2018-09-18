package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex06MaxSumIncreasingSubsequenceTest {

    @Test
    void getMaxSum() {
        int a[] = {1, 101, 2, 3, 100, 4, 5};
        int[] b  = {10, 5, 4, 3};
        assertEquals(10, new Ex06MaxSumIncreasingSubsequence().getMaxSum(b, 4));
     }
}