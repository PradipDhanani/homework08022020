package homework29022020;
/*
 Digit Sum Challenge
Write a method with the name sumDigits that has one int parameter called number.
If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.
Hint:  Use n % 10 to extract the least-significant digit.
 Use n = n / 10 to discard the least-significant digit.
 The method needs to be static
 Create a class with the name DigitSumChallenge
 */

public class Exe_4 {//class

    public static void main(String[] args) {//main method
        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));//printing statement
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));//printing statement
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));//printing statement
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));//printing statement
    }

    private static int sumDigits(int number) {//static method with private modifier
        if (number < 10) {//if statement
            return -1;
        }

        int sum = 0;// local variable

        while (number > 0) {//while loop condition
            //Extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            //Drop the least-significant digit
            number /= 10;
        }

        return sum;
    }


}
