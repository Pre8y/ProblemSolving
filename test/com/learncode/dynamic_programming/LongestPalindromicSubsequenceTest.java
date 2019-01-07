package com.learncode.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubsequenceTest {

    @Test
    void longestPalindrome() {
        int i = 0;
        int j = "ABBDCACB".length();
        int[][] t = new int[i][j];
        String res = "BCAB";
        assertEquals(4, new LongestPalindromicSubsequence().longestPalindrome("ABBDCACB", i,j,t));
    }

}