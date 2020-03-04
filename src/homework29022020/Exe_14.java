package homework29022020;

/*
Write a program in Java to display the pattern like a diamond.
 While loop

              *
             ***
            *****
           *******
          *********
         ***********
        *************
         ***********
          *********
           *******
            *****
             ***
              *

 */


import java.util.Scanner;

public class Exe_14 {//class

    public static void main(String[] args) {//main method

        Scanner scan = new Scanner(System.in);//scanner class

        System.out.println("Enter N : ");//printing statement
        int n=scan.nextInt();
        System.out.print("Enter Symbol : ");//printing statement

        char c = scan.next().charAt(0);
        scan.close();//closing scanner
        //local variable
        int i=1;
        int j;
        do
        {//do while statement
            j=1;
            do
            {
                System.out.print(" ");//printing statement

            }while(++j<=n-i+1);//while do statement
            j=1;
            do
            {
                System.out.print(c);//printing statement

            }while(++j<=i*2-1);//while loop statement
            System.out.println();//printing statement
        } while(++i<=n);//while loop statement
        i=n-1;
        do////do while statement
        {
            j=1;
            do//do while statement
            {
                System.out.print(" ");//printing statement

            }while(++j<=n-i+1);//while do condition
            j=1;
            do
            {
                System.out.print(c);//printing statement

            }while(++j<=i*2-1);//while do condition

            System.out.println();//printing statement

        } while(--i>0);//while do condition


    }



}











































