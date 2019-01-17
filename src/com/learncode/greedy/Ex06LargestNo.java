package com.learncode.greedy;

public class Ex06LargestNo {
    String getLargestNo(int n, int s){
        int[] t = new int[n];
        int count = 0;
        if(s==0){
            return "-1";
        }
        for(int i =9;i>=0;i--){
            while(s>=i && count<n){
                t[count++] = i;
                s-=i;

            }
        }
        StringBuilder str = new StringBuilder();
        if(s==0){
            for(int i = 0;i<n;i++){
                str.append(t[i]);
            }
        }else{
            return "-1";
        }
       return str.toString();

    }
}
