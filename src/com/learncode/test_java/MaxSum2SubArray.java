package com.learncode.test_java;

public class MaxSum2SubArray {

    int getMaxSum(int[]a, int k, int l){
        int n = a.length;
        int[] sum1 = new int[n];
        int[] sum2 = new int[n];
        int start = 0;
        for(int i = 0; i<n;i++){
            if(i-k+1>0)start=i-k+1;
            sum1[i] = getSubArraySum(a, start, i);
        }
        start=0;
        for(int i = 0; i<n;i++){
            if(i-l+1>=0)start=i-l+1;
            sum2[i] = getSubArraySum(a, start, i);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j<i-k || j<i+k) {
                    max = sum1[i] + sum2[j] > max ? sum1[i] + sum2[j] : max;
                }
            }

        }
        return max;
    }



    int getSubArraySum(int[] a, int start , int end){
        int sum = 0;
        for(int i=start;i<=end;i++){
            sum+=a[i];
        }
        return sum;
    }
}
