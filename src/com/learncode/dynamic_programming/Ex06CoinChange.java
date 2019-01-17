package com.learncode.dynamic_programming;
/*
Given a value N, find the number of ways to make change
for N cents, if we have infinite supply of each of
S = { S1, S2, .. , Sm} valued coins. The order of coins doesn’t
matter. For example, for N = 4 and S = {1,2,3}, there are four
solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4.
For N = 10 and S = {2, 5, 3, 6}, there are five solutions:
{2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. So the output
should be 5.
 */
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
