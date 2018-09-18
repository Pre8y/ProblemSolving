package com.learncode.array;

/*
Given an unsorted array of non-negative integers,
find a continuous sub-array which adds to a given number.
 */
public class Ex03SubArrayForGivenSum {
    public void findSubArrayForGivenSum(int[] a, int n, int sum) {
        int start = 0;
        int end = 0;
        int currentSum = 0;
        while (end < n  && currentSum != sum) {
            currentSum +=  a[end];
            if (currentSum > sum) {
                while (currentSum > sum && start<end) {
                    currentSum -= a[start];
                    start++;
                }
            }
            end++;
        }
        if (currentSum == sum) {
            System.out.print((start+1) + " " + end);
        } else {
            System.out.print(-1);
        }

    }

}
