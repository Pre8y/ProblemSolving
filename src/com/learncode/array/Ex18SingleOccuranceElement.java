package com.learncode.array;
/*
Given a sorted array A, size N, of integers;
 every element appears twice except for one.
  Find that element in linear time complexity
  and without using extra memory.
  Input:
1
11
1 1 2 2 3 3 4 50 50 65 65
Output:
4
 */
public class Ex18SingleOccuranceElement {
    int search(int[] a, int start, int end){
        if(start==end) return a[start];
        if(start>end) return -1;
        int mid = (start+end)/2;
        if(mid%2==0){
            if(a[mid+1]==a[mid]){
                 return search(a, mid+2, end);
            }else{
                return search(a, start, mid);
            }
        }else{
            if(a[mid-1]==a[mid]){
                 return search(a, mid+1, end);
            }else{
               return search(a, start, mid-1);
            }
        }
    }
    int getSingleOccuranceNo(int[] a){
        int xor = 0;
        for(int i = 0;i< a.length;i++){
            xor= xor^a[i];
        }
        return xor;
    }
}
