package com.learncode.dynamic_programming;

public class Ex0301KnapSack {

    int getMaxValue(int W, int[] wt, int[] v){
        int n = v.length;
        //knap_sack values
        int[][] ks = new int[n+1][W+1];
        //outer loop for no of items
        for(int i = 0;i<=n;i++){
            //inner loop for all possible weight
            for(int w = 0; w<=W;w++){
                //either no of item of knap_sack capacity is 0  knap sack value is 0
                if(i==0||w==0){
                    ks[i][w] = 0;
                }else if(wt[i-1]<=w){// if weight of current item is less than or equal to capacity
                    // max of (include value , exclude value
                    //exclude value is above cell ks[i-1][w]
                    //include value val[i-1] + from above row value at current capacity - current weight
                    // val[i-1]+ ks[i-1][w-wt[i-1]]
                    ks[i][w] = Integer.max(v[i-1]+ks[i-1][w-wt[i-1]], ks[i-1][w]);
                }else{
                    //exclude value is above cell ks[i-1][w]
                    ks[i][w] = ks[i-1][w];
                }
            }
        }
        return ks[n][W];
    }
}
