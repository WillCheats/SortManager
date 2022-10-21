package com.sparta.ws;
import java.util.*;

public class Starter {
    public void start()
    {
        boolean yorn = false;
        while (yorn == false)
        {
            System.out.println("What do you want to go to?" +
                    "\n 'bubble' for bubble sort" +
                    "\n 'BT' for binary tree "+
                    "\n 'insertion' for insertion sorting" +
                    "\n 'quick' for quick sort" +
                    "\n 'merge' for merge sort");
            Scanner kb = new Scanner(System.in);
            String answer = kb.nextLine();
            yorn = SortingFactory.sorter(answer);


        }

    }
}
