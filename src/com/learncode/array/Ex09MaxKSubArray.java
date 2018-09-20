package com.learncode.array;

import java.util.Deque;
import java.util.LinkedList;

/*
Given an array and an integer k,
find the maximum for each and every contiguous
subarray of size k.
 */
//using bruteforce O(n*k)
public class Ex09MaxKSubArray {
    int[] getMaxFromKSubArray(int[] a, int n , int k){
        int[] res = new int[n-k+1];
        for(int i=0; i<n-k+1;i++){
            int max = a[i];
            for(int j=0;j<k;j++){
                max = a[i+j]>max?a[i+j]:max;
            }
            res[i] = max;
        }
        return res;
    }
    //using DEque of size k O(n)
    int[] getMaxFromKSubArrayDq(int[] a, int n ,int k){
        // Deque of index max val indices in descending order in current window
        Deque<Integer> dq = new LinkedList<Integer>();
        int[] res = new int[n-k+1];
        for(int i=0;i<n;i++){
            //check first element/index is out of window remove it
            if(!dq.isEmpty() && (dq.peekFirst()==i-k)){
                dq.removeFirst();
            }
            //check end of deque till a[i] is'nt smaller to other in left keep on removing
            while(!dq.isEmpty() && a[dq.peekLast()]<a[i]){
                dq.removeLast();
            }
            //add index in deque
            dq.addLast(i);
            //leave first 0 to k-1 element all will be in group of smaller than k in front but not max in range of K
            if(i>=k-1){
                res[i-k+1] = a[dq.peekFirst()];
            }
        }

        return res;

    }
}
