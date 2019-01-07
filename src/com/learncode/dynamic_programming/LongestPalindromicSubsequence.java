package com.learncode.dynamic_programming;

public class LongestPalindromicSubsequence {

    int longestPalindrome(String a, int i, int j, int[][] t){
        if(i==0||j==0) return 0;
        if(i==1||j==1) return 1;
        if(a.charAt(i-1)==a.charAt(j-1)){
            t[i][j]  = longestPalindrome(a, i-1, j-1, t)+2;
            return t[i][j];
        }
        if(t[i-1][j]>t[i][j-1]){
            return longestPalindrome(a, i-1, j,t);
        }
        return longestPalindrome(a, i, j-1, t);
    }
}
