package com.learncode.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Given an array of n positive integers.
Write a program to find the sum of maximum sum subsequence
of the given array such that the integers in the subsequence
are sorted in increasing order.


1 101 2 3 100 4 5 =
All the increasing subsequences :
(1,101); (1,2,3,100); (1,2,3,4,5), out of this (1,2,3,100)
has maximum sum,i.e., 106. Hence the output is stated as 106.
 */
public class Ex06MaxSumIncreasingSubsequence {
    public int getMaxSum(int[] a, int n){
//        return getRecursive(a, 0, n, 0, 0);
        return msis(a, n);
    }

    private int msis(int[] a, int n) {
        //create copy array to store max sum so far
        int[] t = Arrays.copyOf(a, n);
        int max = 0;
        //i is for right side array starts from 1
        for(int i=1;i<n;i++){
            //j is left side array starts from 0
            for(int j=0; j<i; j++){
                //if sorted
                if(a[i]>a[j]){
                    // update t at i by max of (a[i]+t[j] current element
                    // plus sum max sum at j) OR
                    // already existing sum at t[i]
                    t[i] = a[i]+t[j]>t[i]?a[i]+t[j]:t[i];
                    //max sum so far in all sums
                    max = t[i]>max?t[i]:max;
                }
            }
        }
        return max;
    }

    private int getRecursive(int[] a, int start, int end, int prev, int sum) {

        if(start==end) return sum;

         int excl = getRecursive(a, start+1, end, prev, sum);
         int incl = sum;
         if(a[start]>prev){
             incl = getRecursive(a, start+1, end, a[start], sum+a[start]);
         }
        System.out.println("a[start] "+a[start]);
        System.out.println("incl "+a[start]+" : "+incl+" excl "+excl );
         return Integer.max(incl, excl);
    }
}
