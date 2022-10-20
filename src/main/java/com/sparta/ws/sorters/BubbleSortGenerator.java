package com.sparta.ws.sorters;
import java.util.*;
public class BubbleSortGenerator {


    public static void bubbleSort2()
    {
        System.out.println("Bubble sort entered");
        int result1= inputNumbers.returns();
        long startTime = System.nanoTime();
        int array[] = new int[result1];

        for(int i = 0; i < result1; i++)
        {
            Random rand = new Random();
            array[i] = rand.nextInt(1000);
        }
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length-1; i++)
        {
            for(int j = 0; j < array.length-1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        long stopTime = System.nanoTime();
        System.out.println("Time taken: " + (stopTime - startTime)+ " nano seconds");
    }
}