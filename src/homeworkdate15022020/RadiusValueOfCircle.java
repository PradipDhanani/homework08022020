package homeworkdate15022020;

import java.util.Scanner;

public class RadiusValueOfCircle {//class

    public static void main(String[] args) {//main method

        double radius;//radius data types
        double perimeterOfCircle = 2.89; //perimeter of circle
        double area; // area data types

        Scanner scan = new Scanner(System.in);// created scanner object
        System.out.println("Enter any radius value of circle: ");//printing statement of radius value for circle
        radius = scan.nextInt();//calling radius variable using object
        area = perimeterOfCircle * radius * radius; // using formula of area
        System.out.println("Area is: " + area);//printing statement to check area


    }

}
