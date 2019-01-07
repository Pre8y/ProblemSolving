package com.learncode.dynamic_programming;

public class LongestCommonSubstring {

    String getLongestCommonSubstring(String a, String b){
        int m = a.length();
        int n = b.length();
        int[][] t = new int[m+1][n+1];
        int maxLen = 0;
        int endIndex = 0;
        for(int i=1;i<=m;i++){
            for(int j = 1; j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    t[i][j] = t[i-1][j-1]+1;
                    if(t[i][j]>maxLen){
                        maxLen = t[i][j];
                        endIndex = i;
                    }
                }
            }
        }
        return a.substring(endIndex-maxLen, endIndex);
    }
}
