package homework22022020;

import java.util.Scanner;

public class Exe_18 {
    /*
    Write a Java program to print the following grid with 10 line using for loop

     */
    public static void main(String[] args) {//main method
        Exe_18 ex = new Exe_18();//object creation
        ex.grid();//calling instance method
    }
    public void grid(){//instance method

        int i = 0;//local variable
        String b;// local variable

        Scanner scan = new Scanner(System.in);//scanner class
        System.out.println("Please enter any character to print the grid line :");//printing statement
        b = scan.nextLine();

        do{
            System.out.println(b+b+b+b+b+b+b+b+b+b);
            i++;
        }while (i<10);
    }
}

