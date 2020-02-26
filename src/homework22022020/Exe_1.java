package homework22022020;

import java.util.Scanner;

public class Exe_1 {
    /*
     Write a java program that tell us that Input number is odd or even?
     HINT: use turnery operator (? :)
     */

    public static void main(String[] args) {//main method
        ternaryMethod();//calling ternary method
    }

    public static void ternaryMethod() {//instance method
        Scanner sca = new Scanner(System.in);//scanner class
        System.out.println("Enter any number to check if number is odd or even");//printing statement
        int a = sca.nextInt();

        String result;//to print the result

        result = (a % 2 == 0) ? "even" : "odd";//turnery operator
        System.out.println("Number is " + result);//printing turnery operator


    }
}















