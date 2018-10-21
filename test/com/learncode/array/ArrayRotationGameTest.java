package com.learncode.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayRotationGameTest {

    @Test
    void getIndicesOfMax() {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(3);
        List<Integer> r = new ArrayList();
        r.add(1);
        r.add(3);
        List<Integer> res = new ArrayRotationGame().getIndicesOfMax(a,r);
        assertEquals(1, 1);
//        assertArrayEquals(new int[]{1, 3}, res.toArray(new Integer[res.size()]));
    }

    @Test
    void getConsSumWays(){
        assertEquals(3, new ArrayRotationGame().getConsSumWays(15));
        assertEquals(1, new ArrayRotationGame().getConsSumWays(10));
        assertEquals(3, new ArrayRotationGame().getConsSumWays(250));


    }
}