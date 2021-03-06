package main.chp3;

import main.chp4.PlayGround;

import java.math.*;
import java.util.*;

/*
    Program uses big numbers to compute the odds of winning the grand prize in a lottery
 */
public class BigIntegerTest {
    public static void runBigIntegerTest(){
        Scanner in =  new Scanner(System.in);

        System.out.println("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        int n = in.nextInt();

        /*
            compute Binomial coefficient n*(n-1)*(n-2)*(n-3)...*(n-k+1) / (1*2*3...*k)
         */

        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i=1; i <= k; ++i){
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }

    public static void test(){
        PlayGround pl = new PlayGround();
        pl.publicVar = 234d;
//        pl.defaultVar = 23d;
    }
}

class Try extends PlayGround{
    Try(){
        super.protectedVar = 34d;
        super.publicVar = 23d;
//        super.defaultVar = 23d;
    }
}
