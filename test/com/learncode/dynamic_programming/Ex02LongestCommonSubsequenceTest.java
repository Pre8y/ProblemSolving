package com.learncode.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex02LongestCommonSubsequenceTest {

    @Test
    void getLength() {
        String a = "AGGTAB";
        String b = "GXTXAYB";
        assertEquals(4, new Ex02LongestCommonSubsequence().getLength(a, b, 6, 7));
        assertEquals("GTAB", new Ex02LongestCommonSubsequence().getSubsequence(a, b, 6, 7));
    }
}