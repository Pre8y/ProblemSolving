package com.learncode.array;

import java.util.Arrays;
/*
Given an array A of positive integers of size N,
where each value represents number of chocolates in a packet.
Each packet can have variable number of chocolates.
There are M students, the task is to distribute chocolate packets
such that :
1. Each student gets one packet.
2. The difference between the number of chocolates given
to the students having packet with maximum chocolates and
student having packet with minimum chocolates is minimum.
 */
public class Ex14ChocolateDistribution {
    int getMinDiff(int[]a, int m){
        Arrays.sort(a);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i+m<=a.length;i++){
                int diff = a[i+m-1]-a[i];
                minDiff = diff<minDiff?diff:minDiff;
        }
        return minDiff;
    }
}
