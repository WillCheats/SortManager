package com.sparta.ws;

import com.sparta.ws.sorters.BubbleSortGenerator;
import com.sparta.ws.sorters.MergeSort;

public class SortingFactory {
    public static boolean sorter(String answer)
    {
        switch (answer)
        {
            case "bubble":
               BubbleSortGenerator.bubbleSort2();
               return true;
            case "merge":
                MergeSort.numberGen();
                return true;
            default:
                System.out.println("Please try again");
                return false;

        }

    }

}
