package com.learncode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex05MaximizeToysTest {

    @Test
    void getMaxToys() {
        int[] a = {1, 12, 5, 111, 200, 1000, 10};
        assertEquals(4, new Ex05MaximizeToys().getMaxToys(a, 50));
    }
}