package homeworkdate15022020;

import java.util.Scanner;

public class UpperToLower {//class

    public static void main(String[] args) {//main method

        String uppercase;// String uppercase
        String lowercase; // String uppercase

        Scanner scan = new Scanner(System.in);//scanner object created
        System.out.println("Enter any word in upper case: ");//printing upper case statement
        uppercase = scan.nextLine();

        lowercase = uppercase.toLowerCase();// lowercase string calling
        System.out.println("Lower case sentence is: " + lowercase);//printing lowercase statement


    }


}
