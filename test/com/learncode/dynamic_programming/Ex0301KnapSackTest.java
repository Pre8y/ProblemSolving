package com.learncode.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex0301KnapSackTest {

    @Test
    void getMaxValue() {
        int[] v = {60, 100, 120};
        int[] w = {10, 20, 30};
        int W = 50;
        assertEquals(220, new Ex0301KnapSack().getMaxValue(50, w, v));
    }
}