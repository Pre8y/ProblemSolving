package com.learncode.array;

import java.util.Arrays;
import java.util.Comparator;

public class Ex20RelativeSorting {
    void sort(Integer[] a, int[] b){
        Arrays.sort(a,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                int firstIndex = -1, secondIndex=-1;

                        firstIndex = search(b, o1);
                        secondIndex = search(b, o2);

                if(firstIndex!=-1 && secondIndex !=-1)
                    return firstIndex-secondIndex;
                else if(firstIndex!=-1){
                    return -1;}
               else if(secondIndex!=-1){
                    return 1;
                }else{
                    return o1-o2;
                }
            }
        });
    }

    private int search(int[] b, Integer o) {
        for (int i = 0; i < b.length; i++) {
            if(o==b[i]) return i;
        }
        return -1;
    }
}
