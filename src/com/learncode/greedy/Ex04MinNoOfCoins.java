package com.learncode.greedy;

import java.util.ArrayList;

public class Ex04MinNoOfCoins {
    String getMinNumCoin(int n){
        ArrayList<Integer> list= new ArrayList<Integer>();
        int[] d = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000} ;
        for(int i = d.length-1; i>=0 && n>0;i--){
            while(n>=d[i]){
                n-=d[i];
                list.add(d[i]);
            }
        }
        StringBuilder str = new StringBuilder();
        for(int a: list){
            str.append(a).append(" ");
        }
        return str.toString();
    }
}
