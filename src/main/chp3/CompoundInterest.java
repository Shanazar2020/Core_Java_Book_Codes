package main.chp3;

import java.util.Arrays;

// Store tabular data in a 2D array
public class CompoundInterest {
    public static void runCompoundInterest(){
//        System.identityHashCode()

        final double STARTRATE = 10D;
        final int NRATES = 6;
        final int NYEARS = 10;

        // set interest rates to 10... 15%
        double [] interestRates = new double[ NRATES ];
        for(int i = 0; i < interestRates.length; i++){
            interestRates[i] = (STARTRATE + i) / 100.0;
        }

        double [][] balance = new double[NYEARS][NRATES];

        // set initial balances to 10000
        Arrays.fill(balance[0], 10000d);

        for(int i = 1; i < balance.length; i++){
            for(int j = 0; j < balance[i].length; j++){

                // get last year's balances from previous row;
                double oldBalance = balance[i-1][j];

                // compute interest
                double interest = oldBalance * interestRates[j];

                // compute this year's balance
                balance[i][j] = oldBalance + interest;
            }
        }

        // print one of interest rates
        for(double rate : interestRates){
            System.out.printf("%9.0f%%", rate * 100);
        }

        System.out.println();
        // print balance table
        for(double[] row : balance){
            for(double b : row){
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        }
    }
}
