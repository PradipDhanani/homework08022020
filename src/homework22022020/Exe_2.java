package homework22022020;

import java.util.Scanner;

public class Exe_2 {//class

    /*
     WAP to input any year like (ex.2007) and find out if it is leap year or not?
     (leap years are 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, and 2048).
     Non leap years are 1700, 1800, and 1900)
*/
    public static void main(String[] args) {//main method
        conditions();//calling static method
    }

    public static void conditions() {//static method

        Scanner sca = new Scanner(System.in);//scanner class
        System.out.println("Enter any year here to check if year is leap year or not leap year");//printing statement
        int year = sca.nextInt();

        if (year % 400 == 0) {// years modulus by 400
            System.out.println("leap year ");//printing statement
        } else if (year % 100 == 0) {//year modulus by 100
            System.out.println("not a leap year");//printing statement
        } else if (year % 4 == 0) {//year modulus by 4
            System.out.println("leap year ");//printing statement
        } else {//else statement if condition doesn't meet
            System.out.println("not leap year");//printing statement
        }


    }
}








