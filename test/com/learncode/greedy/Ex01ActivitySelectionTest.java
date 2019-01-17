package com.learncode.greedy;

import com.learncode.greedy.Ex01ActivitySelection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex01ActivitySelectionTest {

    @Test
    void getMaxActivityCount() {
        int[] s = {50, 74, 59, 31, 73, 45, 79, 24};
        int[] e = {70, 75, 65, 44, 76, 73, 103, 32};
        assertEquals(4, new Ex01ActivitySelection().getMaxActivityCount(s, e));
        int[] s1 = {41, 13, 4, 70, 10, 58, 61, 34, 100, 79};
        int[] e1 = {68, 39, 12, 97, 13, 66, 82, 38, 120, 99};
        assertEquals(5, new Ex01ActivitySelection().getMaxActivityCount(s1, e1));
        int[] s2 = {17, 91, 41, 80, 36, 7, 73, 99};
        int[] e2 = {33, 101, 66, 104, 56, 28, 99, 106};
        assertEquals(4, new Ex01ActivitySelection().getMaxActivityCount(s2, e2));

    }
}