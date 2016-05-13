package com.ibralan.works.beginning;

/**
 * @author Ibrahim Alan
 *         http://ibralan.com
 *         13.05.2016 - 13:11
 */
public class TrueFalseandBoolean
{
    public static void main(String[] args)
    {
        int option;
        int x, y;

        boolean works = false;

        option = 0;
        x = 4;
        y = 2;

        if (option == 0 && works)
        {
            System.out.println("Plus");
        }

        if (option == 1 && works)
        {
            System.out.println("Minus");
        }

        if (option == 2 || works)
        {
            System.out.println("Multiply");
        }
    }
}

