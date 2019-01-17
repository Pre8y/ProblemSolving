package com.learncode.greedy;

import java.util.Arrays;

public class Ex03CoinsPiles {
    int getMinRemovalCount(int[] a, int k){
        int n = a.length;
        Arrays.sort(a);
        int i = 0, j = n-1;
        int count = 0;
        int min = a[i];
        int max = a[j];
        int diff = max-min;
        while (i<j && diff>k){
                int rm = diff-k;
                if(min<rm){
                    a[i] -=min;
                    count+=min;
                    i++;
                }else{
                    a[j] -=rm;
                    count+=rm;
                    j--;
                }
            min = a[i];
            max = a[j];
            diff = max-min;
        }
       return count;
    }

}
