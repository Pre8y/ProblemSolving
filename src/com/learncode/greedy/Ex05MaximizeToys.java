package com.learncode.greedy;

import java.util.Arrays;

public class Ex05MaximizeToys {
    int getMaxToys(int[] a, int k){
        Arrays.sort(a);
        int count = 0;
        for(int i = 0; i<a.length;i++){
            if(a[i]<=k){
                count++;
                k-=a[i];
            }
        }
        return count;
    }
}
