package homework22022020;

import java.util.Scanner;

public class Exe_8 {//class

    /*
     Input any alphabet from a to f and print their city name accordingly
      (use if else) any other Alphabet should be invalid entry
     */
    public static void main(String[] args) {//main method
        af();//calling static method

    }

    public static void af() {//static method
        String alpha;//local variable

        Scanner scan = new Scanner(System.in);//scanner class

        System.out.println("Enter any city name here start with A and f: ");//printing statement
        alpha = scan.next();

        alpha = alpha.toUpperCase();//declared uppercase
        alpha = alpha.toLowerCase();//declares lowercase

        if (alpha.equals("a")) {//alphabet a
            System.out.println("City name is Amreli");//printing statement
        } else if (alpha.equals("b")) {//alphabet b
            System.out.println("City name is Botad");//printing statement

        } else if (alpha.equals("c")) {//alphabet c
            System.out.println("City name is Chalala");//printing statement

        } else if (alpha.equals("d")) {//alphabet d
            System.out.println("City name Dadma");//printing statement

        } else if (alpha.equals("e")) {
            System.out.println("City name is Etiriya");
        } else if (alpha.equals("f")) {//alphabet f
            System.out.println("City name is Faridabad");//printing statement

        } else {//if condition doesn't meet
            System.out.println("Alphabet is not valid");//printing statement
        }


    }


}
