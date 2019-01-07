package com.learncode.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex06CoinChangeTest {

    @Test
    void getNoOfWays() {
        int[] s = {1, 2, 3};
        assertEquals(5, new Ex06CoinChange().getNoOfWays(s, 5));
    }
}