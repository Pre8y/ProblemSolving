package com.learncode.array;

public class LongestIncreasingSubSequence {

    public int getLongestIncreasingSubSequence(int[] a, int n){
        int max = 0;
        int[] t = new int[n];
        for(int i = 0; i<n; i++){
            t[i] = 1;
        }
        for(int i = 1; i<n;i++){
            for(int j=0;j<i;j++){
                if(a[i]>a[j]){
                    t[i] = t[j]+1;
                    max = t[i]>max?t[i]:max;
                }
            }
        }

        return max;
    }
    public int getLongestIncreasingSubSequence(Integer[] a, int n){
        int max = 0;
        int[] t = new int[n];
        for(int i = 0; i<n; i++){
            t[i] = 1;
        }
        for(int i = 1; i<n;i++){
            for(int j=0;j<i;j++){
                if(a[i]>a[j]){
                    t[i] = t[j]+1;
                    max = t[i]>max?t[i]:max;
                }
            }
        }

        return max;
    }
}
