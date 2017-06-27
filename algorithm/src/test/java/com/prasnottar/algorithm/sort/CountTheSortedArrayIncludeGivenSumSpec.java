package com.prasnottar.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bibek on 6/25/17.
 */
public class CountTheSortedArrayIncludeGivenSumSpec {
    @Test
    public void doImplementInNative() {
        CountTheSortedArrayIncludeGivenSum countTheSortedArrayIncludeGivenSum =
                new CountTheSortedArrayIncludeGivenSum();
        Assert.assertEquals(countTheSortedArrayIncludeGivenSum.doImplement(),5);
    }
}
