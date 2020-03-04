package homework29022020;

import java.util.Scanner;

public class Exe_6 {//class
    /*
    Write a program in Java to display the pattern like triangle with a number
     For eg.
     Input number of rows: 10
     Expected Output:
     1
     12
     123
     1234
     12345
     123456
     1234567
     12345678
     123456789
     12345678910
     */

    public static void main(String[] args) {//main method

        triangle();//calling static method to main method
    }

    public static void triangle() {//static method
        int i;//local variable
        int j;//local variable
        int n;
        System.out.println("Enter number ");//printing statement

        Scanner in = new Scanner(System.in);//printing statement
         n = in.nextInt();

        for (i=1;i<=n;i++) {//for loop statement

            for (j=1;j<=i;j++)//for loop statement
                System.out.print(j);//printing statement

            System.out.println("");//printing statement
        }
        in.close();//closing scanner
    }


}










