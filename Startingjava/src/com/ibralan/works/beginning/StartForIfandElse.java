package com.ibralan.works.beginning;

/**
 * @author Ibrahim Alan
 *         http://ibralan.com
 *         13.05.2016 - 09:58
 */
public class StartForIfandElse
{
    public static void main(String[] args)
    {
        int option;
        int x, y;

        option = 0;
        x = 4;
        y = 2;

        if (option == 0)
        {
            System.out.println("X+Y = "+ (x+y));
            System.out.println("Plus");
        }
        else
        {
            System.out.println("Not Plus");
        }

        if (option == 1)
        {
            System.out.println("X-Y = "+ (x-y));
            System.out.println("Minus");
        }
        else
        {
            System.out.println("Not Minus");
        }

        if (option == 2)
        {
            System.out.println("X*Y = "+ (x*y));
            System.out.println("Multiply");
        }
        else
        {
            System.out.println("Not Multiply");
        }
    }
}
