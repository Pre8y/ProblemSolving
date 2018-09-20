package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex11KthSmallestTest {

    @Test
    void getKthSmallest() {
        int[] a = {7, 10, 4, 3, 20, 15};
        assertEquals(7, new Ex11KthSmallest().getKthSmallest(a, 6, 3));
        int[] b = {7, 10, 4, 20, 15};
        assertEquals(15, new Ex11KthSmallest().getKthSmallest(b, 5, 4));

    }
}