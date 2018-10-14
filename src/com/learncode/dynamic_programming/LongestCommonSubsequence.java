package com.learncode.dynamic_programming;

public class LongestCommonSubsequence {
    String getSubsequence(String a, String b, int m, int n) {
        int t[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    t[i][j] = t[i - 1][j - 1] + 1;
                } else {
                    t[i][j] = t[i - 1][j] > t[i][j - 1] ? t[i - 1][j] : t[i][j - 1];
                }
            }
        }
        StringBuffer r = new StringBuffer();
        int i = m , j = n;
       while (i > 0 && j > 0 ) {
                if(a.charAt(i-1) == b.charAt(j-1)){
                    r.append(a.charAt(i-1));
                    i--;j--;
                }else if(t[i-1][j]>t[i][j-1]){
                    i--;
                }else {
                    j--;
                }
        }

        return r.reverse().toString();
    }

    int getLength(String a, String b, int m, int n) {
        int t[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    t[i][j] = t[i - 1][j - 1] + 1;
                } else {
                    t[i][j] = t[i - 1][j] > t[i][j - 1] ? t[i - 1][j] : t[i][j - 1];
                }
            }
        }

        return t[m][n];
    }

}
