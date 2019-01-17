package com.learncode.array;
/*
Given an array of integers, write a function that returns true
 if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.
 Input:
1
5
3 2 4 6 5
Output:
true
 */
import java.util.Arrays;

public class Ex13PythagoreanTriplet {
    boolean hasTriplet(int[]a ){
        Arrays.sort(a);
        for(int i = 0;i<a.length;i++){
            a[i] = a[i]*a[i];
        }

        for(int i = a.length-1;i>=0;i--){
            int l = 0; int r = i-1;
            while (l<r){
                if(a[l]+a[r]==a[i]) return true;
                else if(a[l]+a[r]<a[i]) l++;
                else r--;
            }
        }
        return false;
    }
}
