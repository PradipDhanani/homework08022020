package homeworkdate15022020;

import java.util.Scanner;

public class expressions {//class

    public static void main(String[] args) {//main method

        double a;//local variable
        double b;//local variable
        double c;//local variable
        double d;//local variable
        double e;//local variable

        Scanner scan = new Scanner(System.in);// scanner class created
        System.out.println("Enter any Specified expressions: ");//printing statement
        a = scan.nextDouble();
        System.out.println("Enter any Specified expressions: ");//printing statement
        b = scan.nextDouble();
        System.out.println("Enter any specified expressions: ");//printing statement
        c = scan.nextDouble();
        System.out.println("Enter any specified expressions: ");//printing statement
        d = scan.nextDouble();

        e = ((a * b - b * b) / (c - d));// test data
        System.out.println("Specified Expression is: " + e);//printing statement


    }
}
