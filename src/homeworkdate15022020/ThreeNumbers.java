package homeworkdate15022020;

import java.util.Scanner;

public class ThreeNumbers {//class

    public static void main(String[] args) {//main method

        double a;//local variable
        double b;//local variable
        double c;//local variable
        double approx;//local variable

        Scanner sca = new Scanner(System.in);// scanner object created

        System.out.println("Enter any first number: ");//printing statement
        a = sca.nextDouble();

        System.out.println("Enter any second number: ");//printing statement
        b = sca.nextDouble();

        System.out.println("Enter any third number: "); //printing statement
        c = sca.nextDouble();


        approx = (a + b + c) / 3; //formula

        System.out.println("Approx value is: " + approx);//printing total value
    }

}









