package com.sparta.ws.sorters;

import com.sparta.ws.logger.LoggerClass;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Insertion {
    public static void insertionSort()
    {
        System.out.println("Insertion sort entered");
        int number = inputNumbers.returns();
        long startTime = System.nanoTime();
        int array[] = new int[number];
        for(int i = 0; i < number; i++)
        {
            Random rand = new Random();
            array[i] = rand.nextInt(1000);
        }
        System.out.println("Array:");
        MergeSort.printArray(array);
        String message = "Insertion sort array created";
        try {
            LoggerClass.Logger1(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int size = array.length;
        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;
            while (j >= 0 && key < array[j])
            {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
        System.out.println(Arrays.toString(array));
        long stopTime = System.nanoTime();
        System.out.println("Time taken: " + (stopTime - startTime)+ " nano seconds");
       message = "Insertion sort array sorted ";
        try {
            LoggerClass.Logger1(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
