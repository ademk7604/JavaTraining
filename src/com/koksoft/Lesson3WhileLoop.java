package com.koksoft;

import java.util.Scanner;

public class Lesson3WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("Hello world");
            i++;
        }
        System.out.println("------------------");

        int j = 0;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }
        System.out.println("------------------");

        int k = 10;
        while (k >= 0) {
            System.out.println(k);
            k--;
        }
        System.out.println("------------------");

        int a = 1;

        while (a <= 10) {
            int b = 1;
            while (b <= 10) {
                System.out.println(a + " x " + b + " = " + (a * b));
                b++;
            }
            a++;
        }


        while(true){
            System.out.println("inifitve loop");
            break; // break bitir demek bu break i vermesem dongu bitmez sonsuza kadar sout u yazardi
        }
        System.out.println("-------- girdigi sayilari toplayan negativ girdiginde donguyu bitiren bir dongu ----------");
        int toplam = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(" bir sayi giriniz");
            int sayi = scanner.nextInt();
            if (sayi<0){
                break;
            } else{
                toplam += sayi;
            }
        }
        System.out.println(toplam);
    }

}
class Loop1 {
    public static void main(String[] args) {

        int sayi1 = 0;
        // do-while de sart saglanmasa bile once bir kere girer sonra kontrolde biter onun icin ilkin bir kere yzdirir.
        do {
            System.out.println(sayi1);
            sayi1++;
        }
        while (sayi1 < 5);

        System.out.println("---------");
        int sayi2 = 100;
        do {
            System.out.println("DO-WHILE");
            sayi2++;
        }
        //while de sart saglanmadigi icin hic girmez
        while (sayi2 < 5);

        while (sayi2 < 5) {
            System.out.println("While");
            sayi2++;
        }

        String name = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        do {
            name = scanner.next();
        } while (name.isEmpty());
        System.out.println("name : " + name);
    }
}

    class Fori1{
        public static void main(String[] args) {
            //burda onemli olan ; ile birbirinden ayirmamiz
            for (int i = 6; i <=10 ; i+=2) {
                System.out.println(i);

            }

            for (int i = 6; i >=0 ; i-=2) {
                System.out.println(i);

            }
            String words = "Hello World!";

            for (int i = 0; i <words.length(); i++) {
                System.out.print("["+words.charAt(i)+"]");
            }
//            for (;;) {
//                System.out.println(";; ile sonsuz dongu olusturmus oluyoruz");
//            }
            System.out.println();
        int counter =1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(counter+" ");
                    counter++;
                }
                System.out.println();
            }

        }
    }
    class Loop2Algoritm{
        public static void main(String[] args) {
            //while dongu deyimi icerisndeki girilen num degeri 0 aesit olana kadar sum degerinie toplama yapildi
            Scanner scanner = new Scanner(System.in);
            System.out.println("Start entering numbers : ");

            int sum = 0;
            int num;

            while ((num = Integer.parseInt(scanner.nextLine())) !=0){
                sum += num;

                System.out.printf("Sum : %d%n", sum);
            }
        }
    }


