package com.koksoft;

import java.util.Scanner;

public class Lesson2Methods {
    public static void main(String[] args) {

        sayHello();
        showPi();
        writeMessage("selam");
        writeMessage("koksoft bootcamp");
        topla(3,5); // birsey gostermez yazdirmak lazim asagidaki gibi
        int sonuc = topla(3,5);

        System.out.println(sonuc);
        System.out.println(topla(3,5));//2. yol boyle yapilabilir
        System.out.println(topla("selam ", "dunya"));
        System.out.println(topla(3,5,8));
        System.out.println(topla(3,5,8,9));

        System.out.println(square(4));
      /*System.out.println("lutfen yasinizi giriniz");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(isUnderAge(age));
       */

        if (checkVaccineOrPCR()==true){
            System.out.println("ucaga binebilirsiniz");
        }else{
            System.out.println("ucaga binemezsiniz");
        }

    }

    static boolean checkVaccineOrPCR(){
        Scanner scanner = new Scanner(System.in);
        String answer;
        System.out.println("son 72 saatte pcr testi yaptiniz mi? [Y], [N]");
        answer = scanner.next();

        if (answer.toUpperCase().equals("Y")){
            return true;
        }else{
            System.out.println("asi oldunuz mu? [Y], [N]");
            answer = scanner.next();
            if (answer.toUpperCase().equals("Y")){
                return true;
            }
        }
        return false;

    }

    static boolean isUnderAge(int age) {
        int border = 18;
        if (age<border){
            return true;
        } else {
            return false;
        }
    }


    // method overloading (asiri yuklenme)durumu ayni isimdeki methodun farkli parametreleri (topla)
    static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    static int topla(int sayi1, int sayi2, int sayi3){
        return sayi1+sayi2+sayi3;
    }
    static int topla(int sayi1, int sayi2, int sayi3, int sayi4){
        return sayi1+sayi2+sayi3+sayi4;
    }
    static String topla(String metin1, String metin2){
        return metin1+metin2;
    }

    static  int square(int sayi){
        int sonuc = sayi*sayi;
        return sonuc;
    }
    static void writeMessage(String message){
        System.out.println(message);
    }
    static void showPi(){
        System.out.println(3.14);
    }

    static void sayHello(){
        System.out.println("Merhaba");

    }
}
