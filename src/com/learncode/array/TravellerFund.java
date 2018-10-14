package com.learncode.array;

import java.util.Stack;

public class TravellerFund {
    int getInitialFund(int[] a, int n) {
        int initialfund = 0;
        //-5, -5, 5, -8
        //4, 2, -3
        for (int i = n-1; i >= 0; i--) {
              if(a[i]>0 && initialfund<0){
                  initialfund+=+a[i];
              }else if(a[i]<0){
                  initialfund+=a[i];
              }
        }
//
        return initialfund<0?Math.abs(initialfund):0;
    }
}
