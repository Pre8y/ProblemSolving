package com.learncode.array;

public class Ex15StockBuyAndSell {

    String getDaysForMaxProfit(int[] a){
        StringBuilder str = new StringBuilder();
        int currentMinima = 0,currentMaxima = 0;
       int i = 0;
       int n = a.length;
       boolean found = false;
       while(i<n-1){
           while(i<n-1 && a[i+1]<=a[i])i++;
            currentMinima = i;
           while(i<n-1 && a[i+1]>a[i])i++;
            currentMaxima = i;
            if(currentMinima<currentMaxima){
               str.append("(").append(currentMinima).append(", ")
                       .append(currentMaxima).append(")");
               found = true;
           }
           i++;

       }
       if(!found) str.append("No Profit");
        return str.toString();
    }
}
