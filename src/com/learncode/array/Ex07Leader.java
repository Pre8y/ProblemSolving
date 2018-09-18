package com.learncode.array;
/*
Given an array of positive integers. Your task is to find the leaders
in the array.
Note: An element of array is leader if it is greater than or
equal to all the elements to its right side.
Also, the rightmost element is always a leader.
 */
public class Ex07Leader {

    void getLeader(int[]a, int n){
        boolean[] b = new boolean[n];
        int leader = 0;
        for(int i=n-1; i>=0;i--){
            if(a[i]>=leader){
                leader = a[i];
                b[i] = true;

            }
        }
        for (int i= 0; i<n;i++){
            if(b[i])System.out.print(a[i]+" ");
        }
//        System.out.println();
    }
}
