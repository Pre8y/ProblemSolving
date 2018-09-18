package com.learncode.array;
/*
Given an array A your task is to tell at which position
the equilibrium first occurs in the array.
Equilibrium position in an array is a position such that
the sum of elements below it is equal to the sum of
elements after it.
 */
public class Ex05EquilibriumPoint {
    public int getEquilibriumPoint(int[] a, int n){
        int sum = sumOfArray(a, n);
        int leftSum = 0;
        int rightSum = sum;
        int i = 0;
        while(i<n && leftSum!=rightSum){
            rightSum-=a[i];
            if(rightSum==leftSum){
                return i+1;
            }
            leftSum+=a[i];
            i++;
        }

            return -1;
    }
    public int sumOfArray(int[] a, int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=a[i];
        }
        return sum;

    }
}
