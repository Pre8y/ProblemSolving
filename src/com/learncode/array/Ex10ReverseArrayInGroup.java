package com.learncode.array;

public class Ex10ReverseArrayInGroup {
    /*
    Given an array of positive integers.
    Reverse every sub-array of K group elements.
     */
    int[] getReverseArrayInGroup(int[] a, int n, int k){
        int temp ;
        for(int i=0;i<n;i=i+k){
            int left = i;
            int right = (n-1)<(i+k-1)?n-1:i+k-1;

            while(left<right){
                temp = a[left];
                a[left] = a[right];
                a[right] =temp;
                left++;
                right--;
            }
        }
        return a;
    }
}
