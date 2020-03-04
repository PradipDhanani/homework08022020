package homeworkdate15022020;

import java.util.Scanner;

public class AddTwoBinary {//class

    public static void main(String[] args) {//main method

        Scanner scan = new Scanner(System.in);//scanner class
        System.out.println("Enter first binary number: ");//printing statement
        String x = scan.next();
        System.out.println("Enter second binary number: ");
        String Y = scan.next();

        int m1 = Integer.parseInt(x, 2);// used Integer.parseInt method
        int m2 = Integer.parseInt(Y, 2);//used Integer.parseInt method
        int m3 = m1 + m2;//used + operator

        System.out.println(Integer.toBinaryString(m3));//printing



    }

}


