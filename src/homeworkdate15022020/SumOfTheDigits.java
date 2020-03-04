package homeworkdate15022020;

import java.util.Scanner;

public class SumOfTheDigits {//class
    public static void main(String[] args) {//main method
                int num;//local variables
                int sum = 0;
                int rem;

                Scanner scan = new Scanner(System.in);//scanner class
                System.out.println("Enter an Integer Value : ");//printing statement
                num = scan.nextInt();
                scan.close();
                while (num > 0) {
                    rem = num % 10;
                    sum = sum + rem;
                    num = num / 10;

                }
                System.out.println("The Sum of the Digit is : " + sum);









            }
}
