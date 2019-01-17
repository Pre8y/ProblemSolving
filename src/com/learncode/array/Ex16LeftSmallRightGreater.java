package com.learncode.array;
/*
Given an unsorted array of size N. Find the first
element in array such that all of its left elements are smaller
and all right elements to it are greater than it.
Input:
3
4
4 2 5 7
3
11 9 12
6
4 3 2 7 8 9

Output:
5
-1
7
Explanation:
Testcase 1 : Elements on left of 5 are smaller
than 5 and on right of it are greater than 5.
 */
public class Ex16LeftSmallRightGreater {
    int getElement(int[] a) {
        int[] leftMax = new int[a.length];
        int[] rightMin = new int[a.length];
        leftMax[0] = a[0];
        rightMin[a.length - 1] = a[a.length - 1];
        for (int i = 1; i < a.length; i++) {
            leftMax[i] = a[i] > leftMax[i - 1] ? a[i] : leftMax[i - 1];
        }
        for (int i = a.length - 2; i >= 0; i--) {
            rightMin[i] = a[i] < rightMin[i + 1] ? a[i] : rightMin[i + 1];
        }
        for (int i = 1; i < a.length; i++) {
            if ((i == 0 && a[i] < rightMin[i + 1]) ||
                    (i == a.length - 1 && a[i] > leftMax[i - 1]) ||
                    (a[i] > leftMax[i - 1] && a[i] < rightMin[i + 1])) return i;
        }

        return -1;
    }
}
