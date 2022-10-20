package com.sparta.ws;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import com.sparta.ws.sorters.MergeSort;
import org.junit.Test;


public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void positiveTest() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void negativeTest(){
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 4, 5,6 , 3};
        MergeSort.mergeSort(actual,0,  actual.length-1);
        assertArrayEquals(expected, actual);
    }
}
