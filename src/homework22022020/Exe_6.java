package homework22022020;

import java.util.Scanner;

public class Exe_6 {//class

    /*
    WAP to input any number and find out if it’s odd or even
     */
    public static void main(String[] args) {//main method
        oddMethod();//calling odd method
    }

    public static void oddMethod() {//static method

        Scanner sca = new Scanner(System.in);//scanner class
        System.out.println("Enter any number here to find if it is odd or even");//printing statement
        int a = sca.nextInt();

        if (a % 2 == 0) {//modulus with even 2 number
            System.out.println("Number is even");//printing statement
        } else {//if statement doesn't meet even number
            System.out.println("Number is odd");//printing statement
        }


    }
}