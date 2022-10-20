package com.sparta.ws;

import java.util.Scanner;

public class inputNumbers {
    public static int returns()
    {
        int result = 0;
        boolean reply = false;
        while(reply == false) {
            System.out.println("How many numbers do you want in the array between 1 and 1000?");
            Scanner kb = new Scanner(System.in);
            result = kb.nextInt();
            if(result> 1000)
            {
                System.out.println("Value entered was greater than 1000, please try again>");
            }
            else if(result < 1)
            {
                System.out.println("Number entered was less than 1, please try again>");
            }
            else {
                reply = true;
            }
        }
        return result;
    }
}
