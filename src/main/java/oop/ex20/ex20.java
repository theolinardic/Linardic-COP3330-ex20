/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 20 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex20;
import java.util.Scanner;

public class ex20 {
    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double userAmount = userInputScanner.nextDouble();
        System.out.print("What state do you live in? ");
        String userState = userInputScanner.next();
        System.out.print("What county do you live in? ");
        userInputScanner.nextLine();
        String userCounty = userInputScanner.nextLine();

        double tax = 0;
        if(userState.equals("Wisconsin")){
            tax = userAmount * 0.05;
            if(userCounty.equals("Eau Claire")){
                tax = tax + (userAmount * 0.005);
            }
            else if(userCounty.equals("Dunn")){
                tax = tax + (userAmount * 0.004);
            }
        }
        else if(userState.equals("Illinois")){
            tax = userAmount * 0.08;
        }

        userAmount = userAmount + tax;
        String finalTax = String.format("$%.2f", tax);
        String finalCost = String.format("$%.2f", userAmount);

        System.out.print("The tax is " + finalTax + ".\nThe total is " + finalCost + ".");
    }

}
