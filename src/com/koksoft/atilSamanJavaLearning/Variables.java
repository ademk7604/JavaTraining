package com.koksoft.atilSamanJavaLearning;

public class Variables {
    public static void main(String[] args){
        System.out.println("Hello java");
        System.out.println(5*25);
        int age = 20;
        System.out.println(10*age);
        int x = 5;
        int y = 11;
        System.out.println(y/x);

        long myLong = 10;
        System.out.println(myLong/5);

        //double - float
        double z = 5.0;
        double a = 11.0;
        System.out.println(a/z);
        double pi = 3.14;
        int r = 5;

        System.out.println(2*r*pi);

        //String
        String name = "James";
        String surname = "Hetfield";

        name= "Lars";

        String fullName= name+" " +surname;
        System.out.println(name + " " + surname);
        System.out.println(fullName);

        //Boolean
        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        //Final
       final int myInteger = 5;
        System.out.println("myInteger: "+myInteger);
        // myInteger = 4; yukarda myInteger dinal olarak belirledigimiz icin veriable i artik degistiremiyoruz
        System.out.println("myInteger: "+myInteger);


    }

}
