package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex18SingleOccuranceElementTest {

    @Test
    void search() {
        int[] a = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        assertEquals(4,
        new Ex18SingleOccuranceElement().search(a,0,10));
    }
}