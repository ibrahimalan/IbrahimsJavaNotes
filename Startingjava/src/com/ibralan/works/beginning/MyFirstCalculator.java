package com.ibralan.works.beginning;

import java.util.Scanner;

/**
 * @author Ibrahim Alan
 *         http://ibralan.com
 *         14.05.2016 - 10:28
 */
public class MyFirstCalculator
{

    public static void main(String[] args)

    {
        while (true)

        {
        boolean works = true;

            {
                int x, y;
                Scanner scan = new Scanner(System.in);

                System.out.print("First Number: ");
                x = scan.nextInt();

                System.out.print("Second Number: ");
                y = scan.nextInt();


                System.out.println("Results: ");
                String calc = scan.nextLine();

                if (calc == ("Plus") || works)
                {
                    System.out.println("Answer For Plus: " + (x + y));
                }
                if (calc == ("Minus") || works)
                {
                    System.out.println("Answer For Minus: " + (x - y));
                }
                if (calc == ("Multiply") || works)
                {
                    System.out.println("Answer For Multiply: " + (x * y));
                }
                if (calc == ("Divided by") || works)
                {
                    System.out.println("Answer For Divided by: " + (x / y));
                }

            }
        }
    }

}