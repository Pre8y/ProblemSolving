package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex14ChocolateDistributionTest {

    @Test
    void getMinDiff() {
        int[] b = {3, 4, 1, 9, 56, 7, 9, 12};
        assertEquals(6, new Ex14ChocolateDistribution().getMinDiff(b, 5));

        int[] a = {17, 83, 59, 25, 38, 63, 25, 1, 37};
        assertEquals(82, new Ex14ChocolateDistribution().getMinDiff(a, 9));

    }
}