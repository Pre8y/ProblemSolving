package com.learncode.array;

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
