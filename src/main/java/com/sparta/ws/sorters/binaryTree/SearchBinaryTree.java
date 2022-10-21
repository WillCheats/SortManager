package com.sparta.ws.sorters.binaryTree;

import java.util.Scanner;

public class SearchBinaryTree
{

    public static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {

            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;
    public static boolean flag = false;
    public SearchBinaryTree()
    {
        root = null;
    }

    public void searchNode(Node temp, int value)
    {

        if(root == null)
        {
            System.out.println("Tree is empty");
        }
        else
        {

            if(temp.data == value)
            {
                flag = true;
                return;
            }

            if(flag == false && temp.left != null)
            {
                searchNode(temp.left, value);
            }

            if(flag == false && temp.right != null)
            {
                searchNode(temp.right, value);
            }
        }
    }
    public static void bstRun()
    {
        SearchBinaryTree bt = new SearchBinaryTree();
        System.out.println("What number do you want to search?");
        Scanner ks = new Scanner(System.in);
        int search = ks.nextInt();
        long startTime = System.nanoTime();
        bt.searchNode(bt.root, search);
        if(flag)
            System.out.println("Element is present in the binary tree.");
        else
            System.out.println("Element is not present in the binary tree.");
        long stopTime1 = System.nanoTime();
        System.out.println("Time taken: " + (stopTime1 - startTime)+ " nano seconds");
    }
}