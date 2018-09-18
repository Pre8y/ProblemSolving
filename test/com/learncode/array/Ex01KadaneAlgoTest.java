package com.learncode.array;

import static org.junit.jupiter.api.Assertions.*;

class Ex01KadaneAlgoTest {

    @org.junit.jupiter.api.Test
    void findMaxSum() {
        int[] a = {-2, 5, -1};
        assertEquals(5, new Ex01KadaneAlgo().findMaxSum(a, 3));
    }
}