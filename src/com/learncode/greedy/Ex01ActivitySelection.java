package com.learncode.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01ActivitySelection {
    int getMaxActivityCount(int[] s, int[] e){
        Activity[] acts = new Activity[s.length];
        for (int i=0;i<s.length;i++){
            Activity act = new Activity();
            act.start = s[i];
            acts[i] =act;
        }
        for (int i=0;i<e.length;i++){
            acts[i].end =e[i];
        }
        Arrays.sort(acts, new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.end-o2.end;
            }
        });
        int count = 1;
        Activity prev = acts[0];
        for (int i=1;i<s.length;i++){
            if(acts[i].start>=prev.end){
                count++;
                prev = acts[i];
            }

        }
        return count;
    }

    class Activity{
        int start, end;
    }
}
