package homeworkdate15022020;

import java.util.Scanner;

public class Triangle {// class name

    public static void main(String[] args) {//main method
        double calculateArea;//calculatedArea is data
        double areaHeight;// areaHeight is data
        double areaLengths;//area Lengths is data
        double baseOfTriangle;//baseOfTriangle is data

        Scanner scan = new Scanner(System.in);//Scanner object created
        System.out.println("Calculate area is: ");//printing Calculate area statement
        scan.nextInt();
        System.out.println("Area Height is: ");//printing Area Height statement
        scan.nextInt();
        System.out.println("Area lengths is: ");//printing area lengths
        scan.nextInt();
        System.out.println("Base of triangle is: ");//printing base of triangle
        scan.nextInt();
        scan.close();

        calculateArea = 100 * 5.9 * 6.9 / 200;//formula is this
        System.out.println("Triangle area is: " + calculateArea);//printing according to formula
    }


}
