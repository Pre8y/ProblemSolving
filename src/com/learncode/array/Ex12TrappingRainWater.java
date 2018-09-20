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
public class Ex12TrappingRainWater {

    public int getUnitOfWaterTrapped(int[] a, int count){
        int units = 0;
        //left pointer right pointer
        int left = 0 , right = count-1;
//        leftMax so far rightmax so far
        int leftMax = 0, rightMax = 0;
        //start from both end and merge
        while(left<right){
            //whatever no. is smaller process that first so that the bigger no will be able
            //to form wall and hold on other side.
            if(a[left]<a[right]){
                //either update left max or add count
                if(a[left]>leftMax){
                    leftMax = a[left];
                }else{
                    units+=(leftMax-a[left]);
                }
                left++;
            }else{
                //either update right max or add count
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