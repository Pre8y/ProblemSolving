package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex09MaxKSubArrayTest {

    @Test
    void printMaxFromKSubArray() {
        int[] a = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        assertArrayEquals(new int [] {3, 3, 4, 5, 5, 5, 6}, new Ex09MaxKSubArray().getMaxFromKSubArray(a, 9, 3));
        assertArrayEquals(new int [] {3, 3, 4, 5, 5, 5, 6}, new Ex09MaxKSubArray().getMaxFromKSubArrayDq(a, 9,3));
    }
}