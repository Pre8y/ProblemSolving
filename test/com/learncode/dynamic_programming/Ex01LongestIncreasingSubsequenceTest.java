package com.learncode.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex01LongestIncreasingSubsequenceTest {

    @Test
    void getLength() {
        int arr[] = {50, 3, 10, 7, 40, 80};
        assertEquals(4, new Ex01LongestIncreasingSubsequence().getLength(arr, 6));
    }
}