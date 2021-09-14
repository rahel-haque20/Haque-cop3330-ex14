/*
* UCF COP 3330 Fall 2021 Assignment 14 Solution
* Copyright 2021 Rahel Haque
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        Scanner tax = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        double order = tax.nextFloat();

        System.out.println("What is the state? ");
        String state = tax.next();

        String test = "WI";
        double total = order;
        double taxes = 0.0;

        if(state.equals(test))
        {
            taxes = 0.55;
            total = order + taxes;
        }

        System.out.printf("The subtotal is %.2f%nThe tax is %.2f%nThe total is %.2f", order, taxes, total);

    }
}