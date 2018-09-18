package com.learncode.array;
/*
Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing,
the missing number is to be found.
 */
public class Ex02FindMissingNumber {
    public int findMissingNumber(int[] a, int n){

        int currentSum = sumOfArray(a, n-1);
        int expectedSum = (n*(n+1))/2;
        return expectedSum-currentSum;

    }
    public int sumOfArray(int[] a, int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=a[i];
        }
        return sum;

    }
}
