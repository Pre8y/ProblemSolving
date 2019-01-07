package com.learncode.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex05EditDistanceTest {

    @Test
    void getDistance() {
        String str1 = "sunday", str2 = "saturday";
        assertEquals(3, new Ex05EditDistance().getDistance(str1, str2, 6, 8));
        String s1 = "geek", s2 = "gesek";
        assertEquals(1, new Ex05EditDistance().getDistance(s1, s2, 4, 5));

    }
}