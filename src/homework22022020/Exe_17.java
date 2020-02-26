package homework22022020;

import java.util.Scanner;

public class Exe_17 {//class

    /*
     Write a Java program to sum values of an array.
     */
    public static void main(String[] args) {//main method
        method();//calling static method

    }

    public static void method() {//static method

        Scanner sca = new Scanner(System.in);//scanner class
        System.out.println("Enter number here to find  sum value ");//printing statement
        int sum = sca.nextInt();

        int[] arrays = {10, 20, 30, 40, 50};//array index
        //int sum = 0;
        for (int i : arrays) {//declare int with arrays
            sum += i;// sum counting from left
            System.out.println("Sum is " + sum);//printing statement
        }
    }


}















