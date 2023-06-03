package com.koksoft.atilSamanJavaLearning;

public class Method {

   public static String userName; // global degisken instans veriable

    public static void main(String[] args) {

        ferchau();
        System.out.println(math(3,4));
        System.out.println(newMethod("Adem"));
        userName= "Atil";

    }
    public static void ferchau(){
        String [] myFerchau = {"F","e","r","c","h","a","u"};
        for (String name : myFerchau){
            System.out.print(name);

        }
        System.out.println(); //bosluk icin
        userName = "kok";
        System.out.println(userName);
    }
    public static int math(int a, int b){
        return a*b;
    }
    public static String newMethod(String string){
    return string + " new Method";
    }


    public void makeMusicians(){
        Musicians james = new Musicians();
        james.age = 50;
        james.instrument = "Guitar";
        james.name = "James";
    }


}
