package homeworkdate15022020;

import java.util.Scanner;

public class SwapTwo {//class

    public static void main(String[] args) {
        int a; //local variable
        int b;//local variable
        int swapping;//local variable
        int swapping1;//local variable

        Scanner scan = new Scanner(System.in);// scanner class
        System.out.println("Enter first number: ");//printing statement
        a = scan.nextInt();
        System.out.println("Enter second number: ");
        b = scan.nextInt();
        scan.close();

        swapping = a;
        swapping1 = b;

        System.out.println("Swapping a variable " + swapping);//printing statement
        System.out.println("Swapping b variable " + swapping1);
        System.out.println("Swapping a variable " + swapping1);
        System.out.println("Swapping b variable " + swapping);
    }


}
