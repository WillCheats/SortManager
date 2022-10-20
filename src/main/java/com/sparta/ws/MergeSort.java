package com.sparta.ws;

import java.util.Random;

public class MergeSort {


   public static void merge(int array[], int p, int q, int number)
   {
        int n1 = q - p + 1;
        int n2 = number - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        for (int i = 0; i < n1; i++)
        {
            L[i] = array[p + i];
        }
        for (int j = 0; j < n2; j++)
        {
            M[j] = array[q + 1 + j];
        }
        int i =0;
        int j = 0;
        int k = p;



        while (i < n1 && j < n2)
        {
            if (L[i] <= M[j])
            {
                array[k] = L[i];
                i++;
            } else
            {
                array[k] = M[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            array[k] = M[j];
            j++;
            k++;
        }
    }
        public static void numberGen(){
            int number = 0;
            number = inputNumbers.returns();
            long startTime1 = System.nanoTime();
            int array[] = new int[number];
            for(int i = 0; i < number; i++)
            {
                Random rand = new Random();
                array[i] = rand.nextInt(1000);
            }
            System.out.println("Array:");
            printArray(array);
            MergeSort.mergeSort(array, 0, number-1);
            System.out.println("Sorted array:");
            printArray(array);
            long stopTime1 = System.nanoTime();
            System.out.println("Time taken: " + (stopTime1 - startTime1)+ " nano seconds");
        }

   public static void mergeSort(int array[], int l, int r)
    {
        if (l < r)
        {
            int m = (l + r) / 2;
            mergeSort(array, l, m);
            mergeSort(array, m + 1, r);
            merge(array, l, m, r);
        }
    }


    static void printArray(int array[])
    {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }


}
