package com.sparta.ws.sorters;
import com.sparta.ws.sorters.binaryTree.BinaryTreeImplementation;



public abstract class BinarySortAscending implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation(arrayToSort);
        return binaryTree.getSortedTreeAsc();
    }
}
