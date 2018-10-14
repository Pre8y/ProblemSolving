package com.learncode.dynamic_programming;

public class EditDistance {
    int getDistance(String a, String b , int m , int n){
        int[][] t =  new int[m+1][n+1];

        for(int i=0; i<=m ;i++){
            for(int j= 0; j<=n ;j++){
                if(i==0){
                    t[i][j] = j;
                }else if(j==0){
                    t[i][j] = i;
                }else if(a.charAt(i-1)==b.charAt(j-1)){
                    t[i][j] = t[i-1][j-1];
                }else{
                    t[i][j] = 1+min(t[i-1][j-1], t[i-1][j], t[i][j-1]);
                }

            }
        }

        return t[m][n];
    }

    private int min(int a, int b, int c) {
        int r = a<b?a:b;
        return r<c?r:c;
    }
}
