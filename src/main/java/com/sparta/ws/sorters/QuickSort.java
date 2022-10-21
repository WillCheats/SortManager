package com.sparta.ws.sorters;

import com.sparta.ws.logger.LoggerClass;

import java.io.IOException;
import java.util.Random;

public class QuickSort{

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {


            if (arr[j] < pivot) {


                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void firstSorter()
    {

        int number = inputNumbers.returns();
        long startTime = System.nanoTime();
        int arr[] = new int[number];
        for(int i = 0; i < number; i++)
        {
            Random rand = new Random();
            arr[i] = rand.nextInt(1000);
        }
        System.out.println("Array:");
        MergeSort.printArray(arr);
            int n = arr.length;
        String message = "Quick sort array created";
        try {
            LoggerClass.Logger1(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

            quickSort(arr, 0, n - 1);
            System.out.println("Sorted array: ");
            MergeSort.printArray(arr);
        long stopTime1 = System.nanoTime();
        System.out.println("Time taken: " + (stopTime1 - startTime)+ " nano seconds");
        message = "Quick sort array sorted:";
        try {
            LoggerClass.Logger1(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
