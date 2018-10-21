package com.learncode.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayRotationGame {
    List<Integer> getIndicesOfMax(List<Integer> a, List<Integer> rotate) {
        int result = indexOfMax(a);
        int size = a.size();
        List<Integer> indices = new ArrayList<>();
        for (int r: rotate) {
            r=r%a.size();
            List<Integer> t = new ArrayList<>();
            t.addAll(a);
//            rotate(t, r);
            if(result-r>=0) {
                indices.add(result - r);
            }else{
                indices.add(size+result - r);
            }
        }
        return indices;
    }
    int indexOfMax(List<Integer> a ){
        int maxIndex = 0;
        for (int i = 1; i < a.size(); i++) {
            maxIndex = a.get(i)>a.get(maxIndex)?i:maxIndex;
        }
        return maxIndex;
    }

    void rotate(List<Integer> a, int d) {
        for (int i = 0; i < d; i++) {
            rotateByOne(a);
        }
    }

    void rotateByOne(List<Integer> a) {
        int temp = a.get(0);
        for (int i = 0; i < a.size()-1; i++) {
            a.set(i, a.get(i+1)) ;
        }
        a.set(a.size()-1, temp);
    }


    public int getConsSumWays(long n) {
//        int i = 0;
//        int j = 0;
////        int sum[] = new int[n];
//        int count = 0;
//        while (j <= n) {
//            int cur_sum = sum(j) - sum(i) + 1;
//            if (cur_sum == n)
//            count++;
//            if( cur_sum <= n) {
//                j++;
//                sum += j;
//            }
//            if cur_sum >= N:
//            sum -= i
//            i++
//        }
//
        return 0;
    }

}
