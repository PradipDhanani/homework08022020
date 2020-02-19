package homeworkdate15022020;


import java.util.Scanner;

public class Pattern {//class

    public static void main(String[] args) {//main method
        String a;//local variable
        String b;
        String c;
        String d;

        Scanner sca = new Scanner(System.in);//scanner class
        System.out.println("First character is:");//printing statement
        a = sca.next();
        a = a.toUpperCase();
        System.out.println("Second character is:");
        b = sca.next();
        b.toLowerCase();
        System.out.println("Third character is: ");
        c = sca.next();
        c.toLowerCase();

        d = c.toUpperCase();

        System.out.println("  " + a + "     " + b + "   " + c + "     " + c + "  " + b);//printing statement
        System.out.println("  " + a + "    " + b + " " + b + "   " + c + "   " + c + "  " + b + " " + b);//printing statement
        System.out.println(a + " " + a + "   " + b + b + b + b + b + "   " + d + " " + d + "  " + b + b + b + b + b);//printing statement
        System.out.println(a + " " + a + "  " + b + "     " + b + "   " + d + "  " + b + "     " + b);//printing statement


    }
}
