package com.koksoft.atilSamanJavaLearning;

public class Method {

   public static String userName; // global degisken instans veriable

    public static void main(String[] args) {

        ferchau();
        System.out.println(math(3,4));
        System.out.println(newMethod("Adem"));
        userName= "Atil";

        makeMusicians();

        makeSimpsons();
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


    public static void makeMusicians(){
        //instance
        Musicians james = new Musicians("James","Guitar",50);
        System.out.println(james.instrument);

    }
// Burda simpsons da veriables public iken bu sekilde calisir. ama asagidaki method da private olan veriables ulasiyoruz
 //   public static void makeSimpsons(){
//        Simpsons homer = new Simpsons("Homer","Nuclear", 50);
//        homer.age = 51;
//        System.out.println(homer.age);

    public static void makeSimpsons(){
        Simpsons homer = new Simpsons("Homer","Nuclear", 50);
        System.out.println(homer.getName());
        homer.setName("Homer Simpson");
        System.out.println(homer.getName());


    }
}
