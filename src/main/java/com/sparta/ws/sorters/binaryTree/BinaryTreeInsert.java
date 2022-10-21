package com.sparta.ws.sorters.binaryTree;

import com.sparta.ws.logger.LoggerClass;
import com.sparta.ws.sorters.MergeSort;
import com.sparta.ws.sorters.inputNumbers;

import java.io.IOException;
import java.util.Random;

public class BinaryTreeInsert
{
    public static void treeInsert()
    {
        new BinaryTreeInsert().run();
    }
    static class Node
    {
        Node left;
        Node right;
        int value;
        public Node(int value)
        {
            this.value = value;
        }
    }
    public void run()
    {
        Node rootnode = new Node(500);//as this is the middle value between 1 and 1000
        System.out.println("Building tree with root value " + rootnode.value);
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
        for(int i = 0; i < number; i++)
        {
            insert(rootnode,arr[i]);
        }
        System.out.println("Array: ");
        MergeSort.printArray(arr);
        long stopTime1 = System.nanoTime();
        System.out.println("Time taken: " + (stopTime1 - startTime)+ " nano seconds");
    }
    public void insert(Node node, int value)
    {
        if (value < node.value)
        {
            if (node.left != null)
            {
                insert(node.left, value);
            } else
            {
                String message = ("  Inserted " + value + " to left of Node " + node.value);
                try {
                    LoggerClass.Logger1(message);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
//                try {
//                    LoggerClass.Logger1(message);
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
                node.left = new Node(value);
            }
        }
        else if (value > node.value)
        {
            if (node.right != null)
            {
                insert(node.right, value);
            } else
            {
                String message = ("  Inserted " + value + " to right of Node " + node.value);
                try {
                    LoggerClass.Logger1(message);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                node.right = new Node(value);
            }
        }
    }
}