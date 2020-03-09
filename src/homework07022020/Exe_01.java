package homework07022020;
/*
 Write a Java program to reverse an array of integer values.
 */

public class Exe_01 {//class

    public static void main(String[] args) {//main method
        // arrays
        int[] arr = new int[]{1, 2, 3, 4, 5};//arrays
        System.out.println("Original array: ");//printing statement
        for (int value : arr) {//for loop condition
            System.out.print(value + " ");//printing statement
        }
        System.out.println();//printing statement
        System.out.println("Array in reverse order: ");//printing statement
        for (int i = arr.length - 1; i >= 0; i--) {//arrays in reverse loop
            System.out.print(arr[i] + " ");//printing statement

        }
    }
}














































