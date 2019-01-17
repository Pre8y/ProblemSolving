package com.learncode.dynamic_programming;
/*
Given an array of integers where each element represents
 the max number of steps that can be made forward from that
  element. Write a function to return the minimum number of
  jumps to reach the end of the array (starting from the first
  element). If an element is 0, then cannot move through that
  element.
  Input:

1
11
1 3 5 8 9 2 6 7 6 8 9

Output:

3
 */
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
