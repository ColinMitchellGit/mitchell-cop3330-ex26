/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex26;
import java.util.Scanner;
import static java.lang.Double.parseDouble;
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        double balance = parseDouble(input.nextLine());

        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = parseDouble(input.nextLine());

        System.out.print("What is the monthly payment you can make? ");
        double monthly_payment = parseDouble(input.nextLine());

        evaluate(balance, apr, monthly_payment);
    }

    public static void evaluate(double balance, double apr, double monthly_payment) {
        double daily_rate = apr/(365*100);

        int months = PaymentCalculator.calculatorMonthsUntilPaidOff(balance,daily_rate,monthly_payment);

        System.out.println("It will take you " + months + " months to pay off this card.");
    }
}