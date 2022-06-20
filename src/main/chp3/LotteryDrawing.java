package main.chp3;

import java.util.Arrays;
import java.util.Scanner;


public class LotteryDrawing {
    public static void runLotteryDrawing(){
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        // fill in array with 1, 2, 3...., n
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        // draw k numbers and put them into a second array
        int[] result = new int[ k ];
        for(int i = 0; i < result.length; i++){
            // make random index between 0  and n-1
            int r = (int) ( Math.random() * n );

            // pick the element at random location
            result[i] = numbers[r];

            // move the last element into the random location
            numbers[r] = numbers[n-1];
            n--;
        }

        // print the sorted array
        Arrays.sort(result);

        System.out.println("Bet the following combination. It'll make you rich!");
        for(int i : result){
            System.out.println(i);
        }
    }
}
