package com.sparta.ws.sorters;
import com.sparta.ws.sorters.binaryTree.BinaryTreeImplementation;



public class BinarySortDescending implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation(arrayToSort);
        return binaryTree.getSortedTreeDesc();
    }
}
