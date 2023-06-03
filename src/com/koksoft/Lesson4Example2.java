package com.koksoft;

import java.util.Scanner;

public class Lesson4Example2 {
    public static void main(String[] args) {
        // while dongusu icinde pozitif ve negatif sayilarin toplamini ayri ayri bulunuz
        Scanner scanner = new Scanner(System.in);
        System.out.println("start entering numbers: ");
        int positiveSum =0;
        int negativeSum =0;
        int num;

        while ((num = Integer.parseInt(scanner.nextLine())) !=0){
            if (num > 0)
                    positiveSum += num;
                else
                    negativeSum += num;

            displayResult(positiveSum,negativeSum);

        }
    }
    public static void displayResult(int positiveSum, int negativeSum){
        if (positiveSum>0)
            System.out.printf("Sum of positive numbers : %d%n", positiveSum);
        else
            System.out.println("You did not enter any posotive numbers");
        if (negativeSum<0)
            System.out.printf("Sum of negative numbers : %d%n", negativeSum);
        else
            System.out.println("You did not enter any negative numbers");
    }

}

