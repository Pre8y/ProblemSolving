package com.learncode.array;

import static org.junit.jupiter.api.Assertions.*;

class Ex01KadaneAlgoTest {

    @org.junit.jupiter.api.Test
    void findMaxSum() {
        int[] a = {1, 2, 3};
        assertEquals(6, new Ex01KadaneAlgo().findMaxSum(a, 3));
    }
}