package homework29022020;
/*
 Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So: 1+125+27=153
 */

import java.util.Scanner;

public class Exe_10 {//class

    public static void main(String[] args) {//main method

        //local variables
        int num;
        int number;
        int temp;
        int total = 0;

        System.out.println("Ënter 3 Digit Number");//printing statement

        Scanner scanner = new Scanner(System.in);//scanner class

        num = scanner.nextInt();
        scanner.close();//closing scanner

        number = num;

        for (; number != 0; number /= 10) {//for loops
            temp = number % 10;
            total = total + temp * temp * temp;
        }

        if (total == num)//if condition
            System.out.println(num + " is an Armstrong number");//printing statement
        else//else statement
            System.out.println(num + " is not an Armstrong number");//printing statement
    }


}














