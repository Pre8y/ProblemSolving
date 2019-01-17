package com.learncode.array;
/*
The cost of stock on each day is given in an array A.
Find all the days on which you buy and sell the stock so that
in between those days you shouldn't have any loss.
Input:
2
7
100 180 260 310 40 535 695
10
23 13 25 29 33 19 34 45 65 67

Output:
(0 3) (4 6)
(1 4) (5 9)
 */
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
