package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex06MaxSumIncreasingSubsequenceTest {

    @Test
    void getMaxSum() {
        int a[] = {1, 101, 2, 3, 100, 4, 5};
        assertEquals(106, new Ex06MaxSumIncreasingSubsequence().getMaxSum(a, 7));
     }
}