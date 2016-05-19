package com.ibralan.works.beginning;

import java.util.Scanner;

/**
 * @author Ibrahim Alan
 *         http://ibralan.com
 *         16.05.2016 - 15:23
 */
public class TryingGame
{
    public static void main(String[] args)
    {
        while (true)
        {
            Scanner scan = new Scanner(System.in);

            String types;
            int a;

            System.out.print("Hello, What is your name?: ");
            types = scan.nextLine();

            System.out.println("Welcome " + types + ". Let's play a game. For start press [ENTER] ");
            types = scan.nextLine();

            System.out.println("Think of a number. Between 1 and 100. Did you? Okay, you are awesome " + types + ". Let's look next step. [ENTER]");
            types = scan.nextLine();

            System.out.println("Now add the same number to your number. When you are done press [ENTER] ");
            types = scan.nextLine();

            System.out.print("Plus with a number which is even and write down here: ");
            a = scan.nextInt();

            System.out.println("Okay you are awesome. Now lastly you have to do from this new number minus the first number that you think.");
            types = scan.nextLine();

            System.out.println("For see the result press [ENTER]");
            types = scan.nextLine();

            System.out.println("Your answer is: " + (a / 2) + ". I am genious right.");

            break;
        }
    }
}
