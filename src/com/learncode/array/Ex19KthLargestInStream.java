package com.learncode.array;

import java.util.PriorityQueue;

public class Ex19KthLargestInStream {
     String printKthLargest(int[] a, int n, int k){
         StringBuilder str  =  new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){

            if(pq.isEmpty() ||pq.size()<k || a[i]>pq.peek()){
                if(pq.size()>=k){pq.poll();}
                pq.offer(a[i]);
            }
            if(pq.size()>=k)
                str.append(pq.peek()+", ");
            else str.append("-1, ");
        }

        return str.toString();
    }
}
