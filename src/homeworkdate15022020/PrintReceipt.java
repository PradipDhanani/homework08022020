package homeworkdate15022020;

import java.util.Scanner;
import java.util.Date;

public class PrintReceipt {// class

    public static void main(String[] args) { //main method

        Date dateobj = new Date();


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Gallons : ");
        double gallon = scan.nextDouble();
        double price = 2.089;

        double fueltotal = (gallon * price);

        System.out.println("+---------------------------------+");

        System.out.println("|           CORNER STORE          |");
        System.out.println("|                                 |");
        System.out.println("|                                 |");
        System.out.println("| " + dateobj + "    |         ");
        System.out.println("|                                 |");
        System.out.println("|   Gallons       :  " + gallon + "         |");
        System.out.println("|                                 |");
        System.out.println("|                                 |");
        System.out.println("|                                 |");
        System.out.println("|   Price/gallon  :$" + price + "         |");
        System.out.println("|                                 |");
        System.out.println("|                                 |");
        System.out.println("|   Fuel Total    :$" + fueltotal + "         |");
        System.out.println("|                                 |");
        System.out.println("|                                 |");
        System.out.println("|                                 |");
        System.out.println("+---------------------------------+");


    }
}
