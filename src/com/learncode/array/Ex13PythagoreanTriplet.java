package com.learncode.array;

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
