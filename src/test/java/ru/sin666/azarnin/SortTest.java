package ru.sin666.azarnin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortTest {

    private int[] ints;
    private int[] expected ={0,1,2,3,4,5,6,7,8,9};

    @Before
    public void init(){
        ints = new int[]{2,9,3,8,4,7,5,6,0,1};
    }

    @Test
    public void testSort(){
        assertArrayEquals("",expected,MySortUtils.sortBubble(ints));
    }
}
