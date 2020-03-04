package homework22022020;

import java.util.Scanner;

public class Exe_9 {//class
    /*
  Input any alphabet from a to f and print their city name accordingly (using switch statement)
  any other Alphabet should be invalid entry
*/

    public static void main(String[] args) {//main method
        alpha1();//calling static method to static area

    }

    static void alpha1() {//static method
        //String alpha;
        Scanner scanner = new Scanner(System.in);//scanner class
        System.out.println("Enter any alphabets start with A and f:");//printing statement
        String alpha = scanner.next();
        scanner.close();

        alpha = alpha.toUpperCase();//uppercase method
        alpha = alpha.toLowerCase();//lowercase method


        switch (alpha) {//sorting a and f alphabet
            case "a":
                System.out.println("City name is Amreli");
                break;

            case "b":
                System.out.println("City name is Botad");
                break;

            case "c":
                System.out.println("City name is chalala");
                break;

            case "d":
                System.out.println("City name is Dadma");
                break;

            case "e":
                System.out.println("City name is Etiriya");
                break;

            case "f":
                System.out.println("City name is Faridabad");
                break;

            default:
                System.out.println("Alphabet is not valid");


        }


    }


}
