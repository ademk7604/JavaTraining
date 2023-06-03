package com.koksoft;

import java.util.Scanner;

public class Lesson4Example3 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num;
        while ((num = Integer.parseInt(kb.nextLine())) != 0){
            int countOfDigits = getCountOfDigits(num);

            System.out.println("The number of digits %d is : %d%n, num, countOfDigits");
            System.out.println("Enter a number: ");
        }
        System.out.println("The number of digits 0 is: 1");


    }

    private static int getCountOfDigits(int num) {
        return num;
    }


}
