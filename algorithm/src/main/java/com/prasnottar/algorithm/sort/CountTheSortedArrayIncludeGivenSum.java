package com.prasnottar.algorithm.sort;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by bibek on 6/25/17.
 * Count pairs from two sorted arrays whose
 * sum is equal to a given value x
 */
public class CountTheSortedArrayIncludeGivenSum {
    private static final Logger LOG = Logger
            .getLogger(CountTheSortedArrayIncludeGivenSum.class.getName());
    private int[] array1 = {1,2,3,4,5,6};
    private int[] array2 = {1,5,6,7,8,9};
    private int x = 10;

    public int doImplement() {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[i] + array2[j] == 10) {
                    count++;
                }
            }
        }
        return count;
    }

}
