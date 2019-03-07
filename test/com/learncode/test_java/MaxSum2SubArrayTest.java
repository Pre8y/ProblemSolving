package com.learncode.test_java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSum2SubArrayTest {

    @Test
    void getMaxSum() {
        int[] a = {6, 1, 4, 6, 3, 2, 7, 4};
        int k = 3;
        int l = 2;
        assertEquals(24, new MaxSum2SubArray().getMaxSum(a, k, l));
    }
}