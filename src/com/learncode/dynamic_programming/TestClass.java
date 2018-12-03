package com.learncode.dynamic_programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
          */

    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int energy = Integer.parseInt(br.readLine());                // Reading input from STDIN
        // Writing output to STDOUT
        String cStr = br.readLine();
        String[] cStrA = cStr.split(" ");
        int c1 = Integer.parseInt(cStrA[0]);                // Reading input from STDIN
          // Writing output to STDOUT
 int c2 = Integer.parseInt(cStrA[1]);           // Reading input from STDIN
           // Writing output to STDOUT
 int c3 = Integer.parseInt(cStrA[2]);     // Reading input from STDIN
           // Writing output to STDOUT
 String csStr = br.readLine();
        String[] csStrA = csStr.split(" ");
 int cs1 = Integer.parseInt(csStrA[0]);            // Reading input from STDIN
           // Writing output to STDOUT
int cs2 = Integer.parseInt(csStrA[1]); // Reading input from STDIN
           // Writing output to STDOUT
int cs3 = Integer.parseInt(csStrA[2]);                // Reading input from STDIN
           // Writing output to STDOUT

        int[] e = {2, 3, 5};
        int[] c = {c1, c2, c3};
        int[] cs = {cs1, cs2, cs3};
        int minAmount = Integer.MAX_VALUE;
        int currentAmount = 0;
        for(int i=0; i<cs.length;i++){
            int cost = cs[i];
            int qty = c[i];
            int en = e[i];
            int totalEnergy = en*qty;
            if(totalEnergy>energy){
                while(totalEnergy>energy && qty>-1){
                    qty--;
                    totalEnergy = en*qty;
                }
            }
            currentAmount = cost*qty;
            if(totalEnergy<energy){
                int remainingEnergy = energy-totalEnergy;
                for(int j=i+1; j<cs.length;j++){
                    int cost1 = cs[j];
            int qty1 = c[j];
            int en1 = e[j];
            int totalEnergy1 = en1*qty1;
            if(totalEnergy1>remainingEnergy){
                while(totalEnergy1>remainingEnergy && qty1>-1){
                    qty1--;
                    totalEnergy1 = en1*qty1;
                }
            }
            if(totalEnergy+totalEnergy1<=energy){
                totalEnergy+=totalEnergy1;
            currentAmount += (cost1*qty1);
            }
                }
            }
            if(totalEnergy==energy){
            minAmount = currentAmount<minAmount?currentAmount:minAmount;
            }
        }
        System.out.println(minAmount>0?minAmount:-1);

    }
}
