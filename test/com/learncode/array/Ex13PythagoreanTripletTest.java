package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex13PythagoreanTripletTest {

    @Test
    void hasTriplet() {
        int[] a = {3, 2, 4, 6, 5};
        assertEquals(true, new Ex13PythagoreanTriplet().hasTriplet(a));
    }
}