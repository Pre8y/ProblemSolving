package com.learncode.dynamic_programming;

public class Ex07SubsetSum {
    boolean isEqualPartitionPossible(int[] a) {
        int sum = sum(a);
        if (sum % 2 != 0) return false;
        int rSum = sum / 2;
        boolean[][] t = new boolean[a.length][rSum+1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= rSum; j++) {
                if (j == 0) {
                    t[i][j] = true;
                } else if (i == 0) {
                    t[i][j] = (a[i] == j);
                } else if (j < a[i]) {
                    t[i][j] = t[i - 1][j - 1];
                } else {
                    if (t[i - 1][j - 1]) {
                        t[i][j] = true;
                    } else if (t[i - 1][j - a[i]]) {
                        t[i][j] = true;
                    } else {
                        t[i][j] = false;
                    }
                }
            }
        }
        return t[a.length-1][rSum];
    }

    private int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
