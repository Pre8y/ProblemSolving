package com.learncode.array;
/*
Given an array A (distinct elements) of size N.
Rearrange the elements of array in zig-zag fashion.
The converted array should be in form a < b > c < d > e < f.
The relative order of elements is same in the output i.e
you have to iterate on the original array only.
Example:
Input:
2
7
4 3 7 8 6 2 1
4
1 4 3 2
Output:
3 7 4 8 2 6 1
1 4 2 3
 */
public class Ex17ZigZagArray {
    int[] zigZag(int[] a){
        boolean flag = true;//i+1 big

        for(int i=0;i<a.length-2;i++){
            if(flag){
                if(a[i+1]<a[i]){
                    swap(a, i, i+1);
                }
            }else{
                if(a[i+1]>a[i]){
                    swap(a, i, i+1);
                }
            }
            flag = !flag;
        }
        return a;
    }

    private void swap(int[] a, int i, int j) {
        int temp= a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
