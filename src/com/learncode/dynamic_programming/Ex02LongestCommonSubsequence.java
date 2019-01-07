package com.learncode.dynamic_programming;

/*
https://www.techiedelight.com/longest-common-subsequence/
 */
public class Ex02LongestCommonSubsequence {
    String getSubsequence(String a, String b, int m, int n) {
        int[][] t = new int[m+1][n+1];

        for(int i = 1; i<m;i++){
            for(int j = 1; j<n;j++){
                if(i==0|| j==0){
                    t[i][j] = 0;
                }else if(a.charAt(i-1)==b.charAt(j-1)){
                    t[i][j] = t[i-1][j-1]+1;
                }else{
                    t[i][j] = Integer.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
      return getSubsequence(a, b, m, n, t);
    }

    private String getSubsequence(String a, String b, int m, int n, int[][] t) {
        if(m==0||n==0) return "";
        if(a.charAt(m-1)==b.charAt(n-1)) return getSubsequence(a, b, m-1, n-1, t)+a.charAt(m-1);
        if(t[m-1][n]>t[m][n-1]) return getSubsequence(a, b, m-1, n , t);
        else return getSubsequence(a, b, m, n-1);
    }

    int getLength(String a, String b, int m, int n) {
       int[][] t = new int[m+1][n+1];

       for(int i = 1; i<=m;i++){
           for(int j = 1; j<=n;j++){
               if(i==0|| j==0){
                   t[i][j] = 0;
               }else if(a.charAt(i-1)==b.charAt(j-1)){
                   t[i][j] = t[i-1][j-1]+1;
               }else{
                   t[i][j] = Integer.max(t[i-1][j], t[i][j-1]);
               }
           }
       }
       return t[m][n];
    }

}
