package com.learncode.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex08MinPlatform {
    int getMinPlatformCount(int n , int[] a, int[] d){
        int count = 1;
        int maxAtATime = 0;
        int i = 1, j = 0;
        Arrays.sort(a);
        Arrays.sort(d);
        //merge
        while (i<n && j<n){
            if(a[i]<=d[j]){
                count++;
                i++;
                maxAtATime = count>maxAtATime?count:maxAtATime;
            }else{
                count--;
                j++;
            }
        }

        return maxAtATime;
    }
}
