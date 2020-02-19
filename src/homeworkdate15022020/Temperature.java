package homeworkdate15022020;


import java.util.Scanner;

public class Temperature {//class name

    public static void main(String[] args) {//main method

        double tempDegree;//variable without any value
        double celsius; //variable without any value
        Scanner sca = new Scanner(System.in);//scanner object creation
        System.out.println("Insert any temperature value in degree: ");//printing statement
        tempDegree = sca.nextDouble();//can select any temperature
        System.out.println("Celsius temperature is : = " + celsius(tempDegree));//printing statement

    }

    static double celsius(double f) {
        return (f - 32) * 5 / 9;//returns the statements
    }


}


