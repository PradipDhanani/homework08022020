package homeworkdate15022020;

import java.util.Scanner;

public class Perimeter {//class

    public static void main(String[] args) {//main method
        double width;//local variable
        double height;//local variable
        double area;//local variable
        double perimeter;//local variable

        Scanner scan = new Scanner(System.in);//scanner class
        System.out.println("Width is: ");//printing statement
        width = scan.nextDouble();//calling width variable
        System.out.println("Height is: ");//printing statement
        height = scan.nextDouble();//calling height variable

        area = width * height;// name given to as variable to call width and height variable
        perimeter = 2 * (width + height);// perimeter formula to calculate with width and height

        System.out.println("Area is for rectangle is: " + area);//printing statement for area
        System.out.println("Perimeter is for rectangle is: " + perimeter);//printing statement for perimeter


    }
}
