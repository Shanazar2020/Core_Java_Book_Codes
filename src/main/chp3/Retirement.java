package main.chp3;
import java.util.*;
/*
    Code demonstrates while loop
 */
public class Retirement {
        public static void runRetirement(){
            Scanner input = new Scanner(System.in);

            System.out.println("How much money do you need to retire? ");
            double goal = input.nextDouble();

            System.out.println("How much do you contribute every year? ");
            double payment = input.nextDouble();

            System.out.println("Interest rate in %: ");
            double interestRate = input.nextDouble();

            double balance = 0;
            int years = 0;

            // update account balance while goal isn't reached
            while(balance < goal){
                // add this year's payment and interest
                balance += payment;
                balance += balance * interestRate / 100;
                years++;
            }

            System.out.println("You can retire in " + years + " years.");

        }
}
