package com.learncode.array;

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
}
