package com.sparta.ws;
import java.util.*;

import static com.sparta.ws.MergeSort.printArray;

public class Starter {
    public void start(){
        boolean yorn = false;
        while (yorn == false)
        {
            System.out.println("What do you want to go to?" +
                    "\n 'bubble' for bubble sort" +
                    "\n 'merge' for merge sort");
            Scanner kb = new Scanner(System.in);
            String answer = kb.nextLine();

            switch (answer)
            {
                case "bubble":
                    System.out.println("Bubble sort entered");
                    BubbleSortGenerator.bubbleSort2();
                    yorn = true;
                    break;
                case "merge":
                    System.out.println("Merge sort entered");
                   MergeSort.numberGen();
                    yorn = true;
                    break;

                default:
                    System.out.println("Please try again");
                    break;

            }

        }

    }
}
