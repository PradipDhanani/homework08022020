package homework29022020;

import java.util.Scanner;
/*
Write a programme to input any number and check if it is prime number or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only.
 In other words, prime numbers can't be divided by other numbers than itself or 1.
 For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.)
 */

public class Exe_12 {//class

    public static void main(String args[]) {//main method
        prime();//calling static method to main method
    }

    public static void prime() {//static method

        int temp;//local variable
        boolean isPrime = true;//local variable

        Scanner scan = new Scanner(System.in);//scanner class

        System.out.println("Enter any number:");//printing statement

        //capture the input in an integer
        int num = scan.nextInt();
        scan.close();//closing scanner class
        for (int i = 2; i <= num / 2; i++)//for loop condition
        {
            temp = num % i;
            if (temp == 0)//if condition
            {
                isPrime = false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if (isPrime)//if condition
            System.out.println(num + " is a Prime Number");//printing statement
        else
            System.out.println(num + " is not a Prime Number");//printing statement
    }

}
