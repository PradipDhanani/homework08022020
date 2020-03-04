package homeworkdate15022020;

import java.util.Scanner;

public class MultiplicationTable {//class

    public static void main(String[] args) {//main method

        Scanner sca = new Scanner(System.in);//scanner object created

        System.out.println("Enter number Eight: ");//printing statement
        int num1 = sca.nextInt();

        for (int i = 0; i < 10; i++) {//for loop syntax to print
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));

        sca.close();
        }


    }


}
