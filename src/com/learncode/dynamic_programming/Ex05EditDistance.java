package com.learncode.dynamic_programming;
/*
Given two strings str1 and str2 and below operations
that can performed on str1. Find minimum number of edits
(operations) required to convert ‘str1′ into ‘str2′.

Insert
Remove
Replace
All of the above operations are of cost=1.
Both the strings are of lowercase.
Input:
1
4 5
geek gesek

Output:
1
 */
public class Ex05EditDistance {
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
