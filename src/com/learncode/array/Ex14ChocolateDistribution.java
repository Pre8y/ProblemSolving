package com.learncode.array;

import java.util.Arrays;

public class Ex14ChocolateDistribution {
    int getMinDiff(int[]a, int m){
        Arrays.sort(a);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i+m<=a.length;i++){
                int diff = a[i+m-1]-a[i];
                minDiff = diff<minDiff?diff:minDiff;
        }
        return minDiff;
    }
}
