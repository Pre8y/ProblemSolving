package com.learncode.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubstringTest {

    @Test
    void getLongestCommonSubstring() {
        assertEquals("BABC", new LongestCommonSubstring().getLongestCommonSubstring("ABABC", "BABCA"));
        assertEquals("", new LongestCommonSubstring().getLongestCommonSubstring("", "B"));

    }
}