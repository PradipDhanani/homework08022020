package homework22022020;

import java.util.Scanner;

public class Exe_7 {
    /*
    WAP input sales id, seller's name, sales amount, and salary basic and then fined this sales
    Commission
    Sales amount >= 50,000 35%
    Sales amount >= 30,000 20%
    >= 20,000 10%
    >= 10,000 5%
    < 10,000 2%

     */
    public static void main(String[] args) {
        Exe_7 ex = new Exe_7();
        ex.commission();
    }

    public void commission() {//instance method
        Scanner scan = new Scanner(System.in); // scanner introduced
        System.out.println("Enter Sales ID : ");//printing statement
        int num = scan.nextInt();

        System.out.println("Sellers name : ");//printing statement
        String name = scan.next();

        System.out.println("Enter the Sales Amount : ");//printing statement
        int a = scan.nextInt();

        System.out.println("Enter the Basic Salary : ");//printing statement
        int sal = scan.nextInt();


        System.out.println("Sales ID : " + num);//printing statement
        System.out.println("Seller's name : " + name);//printing statement
        System.out.println("Sales Amount :" + a);//printing statement
        System.out.println("Basic Salary : " + sal);//printing statement
        scan.close();


        // using Nested if else syntax


        if (a >= 50000) {// for sales 50000 or more, comm 35%
            System.out.println("Sales Commission : 35%");//printing statement
        } else if (a >= 30000) {// for sales 30000 or more, comm 20%
            System.out.println("Sales Commission : 20%");//printing statement
        } else if (a >= 20000) { // for sales 20000 or more, comm 10%
            System.out.println("Sales Commission : 10%");//printing statement
        } else if (a >= 10000) { // for sales 10000 or more
            System.out.println("Sales Commission : 5%");//printing statement
        } else if (a < 10000) {  // for sales under 10000, comm 2%
            System.out.println("Sales Commission : 2%");//printing statement

        }
    }
}
