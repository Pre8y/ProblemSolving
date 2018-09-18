package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex05EquilibriumPointTest {

    @Test
    void getEquilibriumPoint() {
        int[] a = {1, 3, 5, 2, 2};
        assertEquals(3, new Ex05EquilibriumPoint().getEquilibriumPoint(a, 5));
        int[] b = {7, 34, 19, 5, 30, 15, 43, 21, 5, 21, 6, 18, 3, 33};
        assertEquals(-1, new Ex05EquilibriumPoint().getEquilibriumPoint(b,14));
    }
}