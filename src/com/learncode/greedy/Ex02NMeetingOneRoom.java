package com.learncode.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02NMeetingOneRoom {
    String getMeetingsSequence(int[] s, int[] e) {
        int n = s.length;
        Meeting[] meetings = new Meeting[n];
        for (int i = 0; i < n; i++) {
            Meeting meeting = new Meeting();
            meeting.start = s[i];
            meeting.end = e[i];
            meeting.index = i+1;
            meetings[i] = meeting;
        }
        Arrays.sort(meetings, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                return o1.end - o2.end;
            }
        });
        Meeting prev = meetings[0];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(prev.index).append(" ");
        for (int i = 0; i < n; i++) {
            if(meetings[i].start>= prev.end){
                prev = meetings[i];
                stringBuilder.append(prev.index).append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }
    class Meeting{
        int start, end, index;
    }
}
