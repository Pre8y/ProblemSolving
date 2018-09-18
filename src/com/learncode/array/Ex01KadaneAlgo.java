package com.learncode.array;
/*
Given an array containing both negative and positive integers.
Find the contiguous sub-array with maximum sum.
 */
public class Ex01KadaneAlgo {
   public int findMaxSum(int[] a, int n){
       int maxSum = a[0];
       int currentSum = a[0];
       for(int i = 1;i<n;i++){
           currentSum = currentSum+a[i]>a[i]?currentSum+a[i]:a[i];
           maxSum = currentSum>maxSum?currentSum:maxSum;
       }
       return maxSum;
   }
}
