package com.learncode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex02NMeetingOneRoomTest {

    @Test
    void getMeetingsSequence() {
        int[] s = {1, 3, 0, 5, 8, 5};
        int[] e = {2, 4, 6, 7, 9, 9};
        assertEquals("1 2 4 5", new Ex02NMeetingOneRoom().getMeetingsSequence(s, e));
        int[] s1 = {75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924};
        int[] e1 = {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252 };
        assertEquals("6 7 1", new Ex02NMeetingOneRoom().getMeetingsSequence(s1, e1));

    }
}