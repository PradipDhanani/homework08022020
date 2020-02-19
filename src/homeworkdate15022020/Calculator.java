package homeworkdate15022020;


import java.util.Scanner;

public class Calculator {//class


    public static void main(String[] args) {//main method
        // scanner object created

        Scanner scan = new Scanner(System.in);

        int a; //data types for addition
        int b; // data types for addition
        System.out.println("Enter any first numbers to do addition");//printing for first statement
        a = scan.nextInt();
        System.out.println("Enter any second numbers to do addition ");//printing for second statement
        b = scan.nextInt();

        int c; //data types for subtraction
        int d; //data types for subtraction
        System.out.println("Enter any first number to do subtraction");//printing for first statement
        c = scan.nextInt();
        System.out.println("Enter any second number to do subtraction");//printing for second statement
        d = scan.nextInt();

        int e;//data types for multiplication
        int f;//data types for multiplication
        System.out.println("Enter any first number to do multiplication ");//printing for first statement
        e = scan.nextInt();
        System.out.println("Enter any second number to do multiplication"); //printing for second statement
        f = scan.nextInt();

        int g;//data types for division
        int h;//data types for division
        System.out.println("Enter any first number to do division ");//printing for first statement
        g = scan.nextInt();
        System.out.println("Enter any second number to do division");//printing for second statement
        h = scan.nextInt();


        Calculator cal = new Calculator();//object created to call instance method in static method
        cal.add(a, b);// passing values in to parameters50
        cal.sub(c, d);//passing values in to parameters
        multi(e, f);//calling static method directly in main static method using method name and passing parameters
        div(g, h);// calling static method directly in main static method using method name and passing parameters
    }

    // instance method
    public void add(int a, int b) {//inside constructor we are passing parameters
        int result = a + b; // created data types to print result of a and b
        System.out.println("Value for addition is " + result); // printing addition
    }

    // instance method
    public void sub(int c, int d) {//inside constructor we are passing parameters
        int result1 = c - d; //created data types to print result of c and d
        System.out.println("Value for subtraction is " + result1);//printing subtraction
    }

    //static method
    public static void multi(int e, int f) {//inside constructor we are passing parameters
        int result3 = e * f; // created data types to print result for e and f
        System.out.println("Value for multiplication is " + e * f);//printing multiplication
    }

    //static method
    public static void div(int g, int h) {//inside constructor we are passing parameters
        int result4 = g + h;// created data types to print result for g and h
        System.out.println("Value for division is " + g / h);//printing division
    }


}

