package com.ibralan.works.beginning;

import java.util.Scanner;

/**
 * @author Ibrahim Alan
 *         http://ibralan.com
 *         13.05.2016 - 16:54
 */
public class FirstMenuWorks
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int article;

        while (true)

        {
            System.out.println("Pages:");

            System.out.println("For Homepage press: 0");
            System.out.println("For Contact press: 1");
            System.out.println("For exit press: 2");
            System.out.print("$ ");

            article = scan.nextInt();

            if (article == 0)
            {
                System.out.println("Welcome to Homepage");
                System.out.println("Made by Ibrahim.");
            } else if (article == 1)
            {
                System.out.println("Welcome to Contact");
                System.out.println("Phone Number: 05**********.");
            } else if (article == 2)
            {
                System.out.println("Exit Buddy. See ya!");
                break;
            }
        }

    }

}
