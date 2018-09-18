package com.learncode.array;

/*
Given n non-negative integers in array representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
For example:
Input:
3
2 0 2
Output:
2
Structure is like below
|  |
|_|
We can trap 2 units of water in the middle gap.
Input:
2
4
7 4 0 9
3
6 9 9
Output:
10
 0
 */
public class TrappingRainWater {

    public int getUnitOfWaterTrapped(int[] a, int count){
        int units = 0;
        int left = 0 , right = count-1;
        int leftMax = 0, rightMax = 0;
        while(left<right){
            if(a[left]<a[right]){
                if(a[left]>leftMax){
                    leftMax = a[left];
                }else{
                    units+=(leftMax-a[left]);
                }
                left++;
            }else{
               if(a[right]>rightMax){
                   rightMax = a[right];
               } else{
                   units+=(rightMax-a[right]);
               }
               right--;
            }
        }
        return units;
    }
}