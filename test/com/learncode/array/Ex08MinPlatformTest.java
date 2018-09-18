package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex08MinPlatformTest {

    @Test
    void getMinPlatformCount() {
        int[] a = {900,  940, 950,  1100, 1500, 1800};
        int[] d = {910, 1200, 1120, 1130, 1900, 2000};
        assertEquals(3, new Ex08MinPlatform().getMinPlatformCount(6, a,d));
    }
}