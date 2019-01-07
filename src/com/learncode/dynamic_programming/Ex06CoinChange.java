package com.learncode.dynamic_programming;

public class Ex06CoinChange {
    int getNoOfWays(int[] coins, int N){
        int[] ways = new int[N+1];
        ways[0] = 1;
        for(int i = 0;i<coins.length;i++){
            for(int j = 0; j<ways.length;j++){
                if(coins[i]<=j){
                    ways[j] += ways[j-coins[i]];
                }
            }
        }
        return ways[N];
    }
}
