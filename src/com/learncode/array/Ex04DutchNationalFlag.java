package com.learncode.array;
/*
Given an array A of size N containing 0s, 1s, and 2s;
 you need to sort the array in ascending order.
 */
public class Ex04DutchNationalFlag {

    public int[] sortArray(int[] a, int n){

        int start = 0, end = n-1, i =0;
        int pivot = 1;

        while(i<=end){
            if(a[i]<pivot){
                swap(a, i, start);
                start++;
                i++;
            } else if(a[i]>pivot){
                swap(a, i, end);
                end--;
            }else{
                i++;
            }
        }

        return a;
    }

    private void swap(int[] a, int start, int end) {
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }

}
