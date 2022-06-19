package main.chp3;

import java.util.*;

public class Retirement2 {
    public static void runRetirement2(){
        Scanner in = new Scanner(System.in);

        System.out.println("How much money do you need to retire? ");
        double goal = in.nextDouble();

        System.out.println("How much do you contribute every year? ");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        String input;

        // update account balance while user isn't ready to retire
        do {
            // add this year's payment and interest
            balance += payment;
            balance += balance * interestRate / 100;
            years++;

            // print current balance
            System.out.printf("After year %d, your balance %,.2f\n", years, balance);

            // ask if user ready and get input
            System.out.println("Ready to retire? (Y/N) ");
            input = in.next();

        }while( input.equalsIgnoreCase("n"));

    }
}
