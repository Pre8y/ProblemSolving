package com.learncode.array;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubSequenceTest {

    @Test
    void getLongestIncreasingSubSequence() {
        int arr[] = {50, 3, 10, 7, 40, 80};
        assertEquals(4, new LongestIncreasingSubSequence().getLongestIncreasingSubSequence(arr, 6));
        int arr1[] = {2, 4, 3, 7, 4, 5};
        assertEquals(4, new LongestIncreasingSubSequence().getLongestIncreasingSubSequence(arr1, 6));
        try {
            Scanner s = new Scanner(new File("/Users/preetipatwa/git/ProblemSolving2/src/files/input.txt"));
            ArrayList<Integer> list = new ArrayList<Integer>();
            while (s.hasNext()) {
                if (s.hasNextInt()) {
                    list.add(s.nextInt());
                }
            }
            s.close();
            Integer[] k = list.toArray(new Integer[list.size()]);
            assertEquals(185, new LongestIncreasingSubSequence().getLongestIncreasingSubSequence(k, k.length));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}