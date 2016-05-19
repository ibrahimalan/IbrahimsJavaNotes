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
            int x, y;
            Scanner scan = new Scanner(System.in);

            System.out.print("First Number: ");
            x = scan.nextInt();

            System.out.print("Second Number: ");
            y = scan.nextInt();

            System.out.println("Choose an operation: +, -, /, x ");
            Scanner scan2 = new Scanner(System.in);
            String calc = scan2.nextLine();

            if (calc.equalsIgnoreCase("+"))
            {
                System.out.println("Answer For Plus: " + (x + y));
            } else if (calc.equals("-"))
            {
                System.out.println("Answer For Minus: " + (x - y));
            } else if (calc.equals("*"))
            {
                System.out.println("Answer For Multiply: " + (x * y));
            } else if (calc.equals("/"))
            {
                System.out.println("Answer For Divided by: " + (x / y));
            }
        }
    }
}