package com.learncode.dynamic_programming;
/*
Input  : arr[] = {3, 10, 2, 1, 20}
Output : Length of LIS = 3
The longest increasing subsequence is 3, 10, 20

Input  : arr[] = {3, 2}
Output : Length of LIS = 1
The longest increasing subsequences are {3} and {2}

Input : arr[] = {50, 3, 10, 7, 40, 80}
Output : Length of LIS = 4
The longest increasing subsequence is {3, 7, 40, 80}
 */
public class LongestIncreasingSubsequence {
    int getLength(int[] a, int n){
        int length = 0;
        int[] t = new int[n];
        for(int i=0; i<n; i++){
            t[i] = 1;
        }
        for(int i = 1; i<n;i++){
            for(int j=0; j<i;j++){
                if(a[i]>a[j]){
                    t[i] = t[i]>t[j]+1?t[i]:t[j]+1;
                }
            }
        }
        for(int i=0; i<n; i++){
            length = t[i]>length?t[i]:length;
        }
        return length;
    }
}
