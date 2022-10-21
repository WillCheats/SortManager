package com.sparta.ws.sorters;

import com.sparta.ws.logger.LoggerClass;

import java.io.IOException;
import java.util.Scanner;

public class inputNumbers {
    public static int returns()
    {
        int result = 0;
        boolean reply = false;
        while(reply == false) {
            System.out.println("How many numbers do you want in the array between 2 and 1000?");
            Scanner kb = new Scanner(System.in);
            if(kb.hasNextInt())
            {
                result = kb.nextInt();
                if(result> 1000)
                {
                    System.out.println("Value entered was greater than 1000, please try again>");
                }
                else if(result < 2)
                {
                    System.out.println("Number entered was less than 2, please try again>");
                }
                else {
                    String message = "Inputted " + result + " numbers";
                    try {
                        LoggerClass.Logger1(message);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    reply = true;
                }
            }
            else {
                System.out.println("Please input a number>");
            }

        }
        return result;
    }
}
