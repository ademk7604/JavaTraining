package com.koksoft;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
//        //write your code here
//        System.out.println("hallo world!");
//        System.out.println(3+5);
//        System.out.println("5 x 4:"+ (5*4));
//        System.out.println(" I am "+ 20 +" years old");
//        System.out.print("deneme\n");
//        System.out.print("2.deneme\n");
//        // secip ctrl / tamamen yoruma aliyor
//
//        System.out.println("Byte: "+ Byte.MAX_VALUE );
//        System.out.println("Byte: "+ Short.MAX_VALUE );
//        System.out.println("Byte: "+ Integer.MAX_VALUE );
//        System.out.println("Byte: "+ Long.MAX_VALUE );
//
//        byte b =22;
//        short s =120;
//        int x = 20;
//        long uzunsayi = 56656565L;
//        float pi =3.232255f;
//        double pi_extended = 3.256565;
//        char z = '+';
//        int a = 5,bb = 3,c= 7;
//        String name = "koksoft";
//        System.out.println(name);
//
//        name =  "Bootcamp";
//        System.out.println(name);
//        double _dsdsd =345.12;
//        //double *dsdsd =345.12; // double Ali dsdsd =345.12; // double a-dsdsd =345.12; turkce karakter sikinti
//
//        Scanner scanner = new Scanner(System.in);
//        String userName = scanner.next();
//        System.out.println("Hallo "+ userName);
//        int age = scanner.nextInt();
//        System.out.println("yasiniz " +age);

//        int n1 = 25;
//        int n2 = 10;
//        System.out.println(n1+n2);
//        System.out.println(n1-n2);
//        System.out.println(n1*n2);
//        System.out.println(n1/n2);
//        System.out.println(n1/(double)n2);
//        System.out.println(n1%n2);
//
//        n1++;
//        n1 +=5;
//        n1 = n1 + 5;
//        System.out.println(n1);
//
//        int a,b,c;
//        a=5;
//        b=10;
//        c=5;
//        if (a == c) {
//            System.out.println("a esittir c`ye");
//        }
//
//        if (b>a){
//            System.out.println("b buyuktur a dan");
//        }
//
//        if (a>b){
//            System.out.println(" a buyuktur b");
//        }
//
//        if (b != c){
//            System.out.println("a esit degildir c ye");
//        }
//        if (a != c){
//            System.out.println(" esittir");
//        } else {
//            System.out.println("degilmis");
//        }

//        int number = -5;
//
//        if (number == 0) {
//            System.out.println("sayi 0");
//        }
//        else if (number < 0) {
//            System.out.println("sayi negatiftir");
//        }
//       else  if (number>0){
//            System.out.println("sayi pozitifdir");
//        }

//        int age = 17;
//        if (age>=18){
//            System.out.println("resitsiniz");
//        } else if (age<18) { // bu kontrolu tekrar yapmaya gerek yok asagidaki daha dogru.
//            System.out.println("resit degilsiniz");
//
//        }
//
//        int age2 = 17;
//        if (age2>=18){
//            System.out.println("resitsiniz");
//        } else {
//            System.out.println("resit degilsiniz");
//
//        }
//        Scanner scanner = new Scanner(System.in);
//       int not= scanner.nextInt();
//        // int not = 95;
//         if (not>=90){
//             System.out.println("AA");
//         } else if (not>=85) {
//             System.out.println("BA");
//         } else if (not>=80) {
//             System.out.println("BB");
//         } else if (not>=75) {
//             System.out.println("CB");
//         } else if (not>=50) {
//             System.out.println("kosullu gectiniz");
//         } else {
//             System.out.println("dersten kaldiniz");
//         }

//
//        Scanner scanner = new Scanner(System.in);
//        int s1 = scanner.nextInt(), s2 = scanner.nextInt(), s3 = scanner.nextInt();
//
//        if (s1>=s2 && s1>=s3) {
//            System.out.println(s1 + " en buyuk sayidir");
//        } else if (s2 >= s1 && s2 >= s3) {
//            System.out.println(s2 + " en buyuk sayidir");
//        }else {
//            System.out.println(s3 + " en buyuk sayidir");
//        }
//        System.out.println("lutfen bir sayi giriniz");
//        Scanner scanner = new Scanner(System.in);
//        int gunSayisi = scanner.nextInt();
//        switch (gunSayisi)
//        {
//            case 1:
//                System.out.println("pazartesi");
//                break;
//            case 2:
//                System.out.println("sali");
//                break;
//                case 3:
//                    System.out.println("carsamba");
//                    break;
//            case 4:
//                System.out.println("persembe");
//                break;
//            case 5:
//                System.out.println("cuma");
//                break;
//                case 6:
//                    System.out.println("cumartesi");
//                    break;
//            case 7:
//                System.out.println("pazar");
//                break;
//
//        }
//        System.out.println("Lutfen bir renk giriniz");
//        Scanner scanner = new Scanner(System.in);
//
//        String color = scanner.next();
//        switch (color) {
//            case "red":
//                System.out.println("dur");
//                break;
//                case "green":
//                    System.out.println("haziran");
//                    break;
//                    case "blue":
//                        System.out.println("gec");
//                        break;
//            default:
//                System.out.println("bir renk tanimli degil");
//                break;
//        }
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2;
        String islem;

        System.out.println("1. sayi: ");
        sayi1 = scanner.nextInt();

        System.out.println("2. sayi: ");
        sayi2 = scanner.nextInt();

        System.out.println("islem (+ - */%)");
        islem = scanner.next();
      /*  switch (islem) {
            case "+":
                System.out.println(sayi1 + islem + sayi2 + "= " + (sayi1+sayi2));
                break;
            case "-":
                System.out.println(sayi1 + islem + sayi2 + "= " + (sayi1-sayi2));
                break;
            case "*":
                System.out.println(sayi1 + islem + sayi2 + "= " + (sayi1*sayi2));
                break;
            case "/":
                System.out.println(sayi1 + islem + sayi2 + "= " + (sayi1/sayi2));
                break;
            case "%":
                System.out.println(sayi1 + islem + sayi2 + "= " + (sayi1%sayi2));
                break;
            default:
                System.out.println("sayi belirlenemedi");

        }

       */
     /*   if (islem.equals("+")){
            System.out.println(sayi1 + islem + sayi2 + "= " + (sayi1+sayi2));
        } else if (islem.equals("-")) {
            System.out.println(sayi1 + islem + sayi2 + "= " + (sayi1-sayi2));
        } else if (islem.equals("*")) {
            System.out.println(sayi1 + islem + sayi2 + "= " + (sayi1*sayi2));
        } else if (islem.equals("/")) {
            System.out.println(sayi1 + islem + sayi2 + "= " + (sayi1/sayi2));
        } else if (islem.equals("%")){
            System.out.println(sayi1 + islem + sayi2 + "= " + (sayi1%sayi2));
        } else {
            System.out.println("islem tanimlanmadi");
        }

      */

    }
}
