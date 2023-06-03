package com.koksoft.atilSamanJavaLearning;

public class Statements {
    public static void main(String[] args) {

    // and ikisinden biri tru olursa tru doner
        // && ikiside true olursa true doner

        int x = 30;
        int y = 30;
        int z = 5;


     // if statements
     if (x < y) {
         System.out.println("y is bigger");

     } else if (y < x) {
         System.out.println("x is bigger");

     } else {
         System.out.println("x = y");
     }

    int day = 3;
     String dayString = "";
   /*  if(day == 1){
         dayString = "Monday";
     } else if (day == 2) {
         dayString = "Teusday";
     } else if (day == 3) {
         dayString = "Wednesday";
     } else {
         dayString = "Sunday";
     }

        System.out.println(dayString); */

     switch (day) {
         case 1:
             dayString = "Monday";
             break;
         case 2:
             dayString = "Tuesday";
             break;
         case 3:
             dayString  = "Wednesday";
             break;
         default:
             dayString = "Sunday";
             break;
     }
        System.out.println(dayString);
    }
}
