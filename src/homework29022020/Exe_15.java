package homework29022020;

public class Exe_15 {//class
    public static void main(String[] args) {//main method
        for (int i = 0; i<5; i++) {//for loop condition
            for (int j = 0; j <5 - i; j++) {//for loop condition
                System.out.print(" ");//printing statement
            }
            for (int k = 0; k <= i; k++) {//for loop condition
                System.out.print("* ");//printing statement
            }
            System.out.println();//printing statement
        }
    }



}
