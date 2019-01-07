package com.learncode.dynamic_programming;

public class Ex04MinNoOfJump {
    int getMinJump(int[] a){
        int n = a.length;
        int[] jumpCount = new int[n];
        int[] startPoint = new int[n];
        //can i reach to i index from a[j] jumps
        for(int i=1;i<n;i++){
            jumpCount[i] = Integer.MAX_VALUE-1;
            for(int j= 0;j<i;j++){
                int currentMaxJump = a[j];
                if(i<=a[j]+j){
                    jumpCount[i]= Math.min(jumpCount[j]+1, jumpCount[i]);
                    startPoint[i] = j;
                }
            }
        }
        return jumpCount[n-1]!=Integer.MAX_VALUE-1?jumpCount[n-1]:-1;
    }
}
