package com.learncode.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {

    @Test
    void getDistance() {
        String str1 = "sunday", str2 = "saturday";
        assertEquals(3, new EditDistance().getDistance(str1, str2, 6, 8));
    }
}