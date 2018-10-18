
/************************************************************************
 * File Name:   Barrios_Lesson4.java
 * 
 * Due Date:    10/17/18
 * 
 * Author:      Joshua Barrios  
 * 
 * Program Description:  
 *              This program is designed to calculate the total cost of a car loan
 * 
 * Program Input:         
 *              car loan amount, annual percentage rate, term of car loan in years
 * Program Output:                   
 *              car loan amount, interest rate, loan period in months, monthly payment, and the total cost of the car 
 * Program Processing:           
 *              
 * **********************************************************************/

import java.util.Scanner;

public class Barrios_Lesson4 {
    public static void main(String[] args) {
        // variables I will ask the user to define
        double carLoan, aCentRate, years;

        System.out.println("\n            Car loan calculator             ");
        System.out.println("********************************************");

        // storing the user input into the variables
        // Car loan amount
        System.out.print("\nCar Loan Amount: $");
        Scanner answer1 = new Scanner(System.in);
        carLoan = answer1.nextDouble();

        // Annual percentage rate
        System.out.print("\nAnnual Percentage Rate (%): ");
        Scanner answer2 = new Scanner(System.in);
        aCentRate = answer2.nextDouble();

        // number of years
        System.out.print("\nTerm of Car Loan (In years): ");
        Scanner answer3 = new Scanner(System.in);
        years = answer3.nextDouble();

        // turning annual percentage rate into monthly percentage rate
        double mIntRate = (aCentRate / 100);

        // firstHalf is the start of the formula
        double firstHalf = (mIntRate / 12) * carLoan;

        // turning years into months
        double months = years * 12;

        // SecHalf is the bottom portion of the formula, used math.pow for months
        double SecHalf = (1 - (Math.pow(1 + ((mIntRate / 12)), -months)));

        // the final step for the month cost and I'm dividing the two variable halves
        double monthCost = firstHalf / SecHalf;
        // calculating total loan cost of the car

        double totalLoan = months * monthCost;

        // printing out the program
        System.out.println("********************************************");
        System.out.println("               Monthly Cost             ");
        System.out.println("Loan Amount                       $" + carLoan);
        System.out.println("Interest rate (%)                 " + aCentRate);
        System.out.println("Loan Period (months)              " + months);

        // rounding the decimals to two
        System.out.printf("Monthly Payment                   $%.2f", monthCost);
        System.out.printf("\nTotal cost of Car Loan:           $%.2f", totalLoan);
        System.out.println("\n********************************************");
    }// end of main

}// end of class