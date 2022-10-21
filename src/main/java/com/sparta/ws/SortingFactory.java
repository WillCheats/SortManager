package com.sparta.ws;

import com.sparta.ws.sorters.*;
import com.sparta.ws.sorters.binaryTree.BinaryTreeInsert;
import com.sparta.ws.sorters.binaryTree.SearchBinaryTree;

import java.util.Scanner;

public class SortingFactory {
    public static boolean sorter(String answer)
    {
        switch (answer)
        {
            case "bubble":
               BubbleSortGenerator.bubbleSort2();
               return Retry.retry();
            case "merge":
                MergeSort.numberGen();
                return Retry.retry();
            case "insertion":
                Insertion.insertionSort();
                return Retry.retry();
            case "BT":
                System.out.println("Do you want to build a tree? (Y/N)");
                Scanner ts = new Scanner(System.in);
                String reply = ts.nextLine();
                if(reply.equalsIgnoreCase("Y"))
                {
                    BinaryTreeInsert.treeInsert();
                }

                SearchBinaryTree.bstRun();
                return Retry.retry();

            case "quick":
                QuickSort.firstSorter();
                return Retry.retry();
            default:
                System.out.println("Please try again");
                return false;

        }

    }

}
