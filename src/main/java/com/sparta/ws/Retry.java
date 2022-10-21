package com.sparta.ws;

import com.sparta.ws.logger.LoggerClass;

import java.io.IOException;
import java.util.Scanner;

public class Retry {
    public static boolean retry()
    {
        System.out.println("Would you like to retry? (Y/N)");
        Scanner ws = new Scanner(System.in);
        String answer2 = ws.nextLine();

        if(answer2.equalsIgnoreCase("y"))
        {
            String message = "Retrying";
            try {
                LoggerClass.Logger1(message);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return false;
        }
        else {
            return true;
        }
    }
}
