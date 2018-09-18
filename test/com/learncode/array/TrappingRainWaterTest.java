package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    @Test
    void getUnitOfWaterTrapped() {
        int[] a = {7, 4, 0, 9};
        int[] b = {8, 8, 2, 4, 5, 5, 1};
        assertEquals(10, new TrappingRainWater().getUnitOfWaterTrapped(a, 4));
        assertEquals(4, new TrappingRainWater().getUnitOfWaterTrapped(b, 7));

    }
}