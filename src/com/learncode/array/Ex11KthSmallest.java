package com.learncode.array;

import java.util.PriorityQueue;

/*
Given an array and a number k where k is smaller than size of array,
the task is to find the k’th smallest element in the given array.
It is given that all array elements are distinct.
 */
public class Ex11KthSmallest {
    int getKthSmallest(int[] a, int n ,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
        for(int i = 0; i<n;i++){
            pq.offer(a[i]);
        }
       for(int i=0;i<k-1;i++){
            pq.poll();
       }
        return pq.peek();

    }
}
