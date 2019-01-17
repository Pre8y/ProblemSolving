package com.learncode.greedy;

import java.util.Arrays;

public class Ex09MinSumOfProduct {
    int getMinSumOfProduct(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int sum= 0;
        int n =a.length-1;
        for(int i = 0; i<=n;i++){
            sum += a[i]*b[n-i];
        }
        return sum;
    }
}
