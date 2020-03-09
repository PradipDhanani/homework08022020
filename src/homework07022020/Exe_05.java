package homework07022020;

import java.util.ArrayList;

public class Exe_05 {//class
    /*
     Write a Java program to test an array list is empty or not.
     */
    public static void main(String[] args) {//main method
            ArrayList<String> c1 = new ArrayList<>();//array list object creation
            c1.add("Bhavesh");//added string
            c1.add("Srinivas");//added string
            c1.add("Chaitanya");//added string
            c1.add("Ankita");//added string
            c1.add("Lamee");//added string
            System.out.println("Original array list: " + c1);//printing statement
            System.out.println("Checking the above array list is empty or not! " + c1.isEmpty());//printing statement
            c1.removeAll(c1);//removing method
            System.out.println("Array list after remove all elements " + c1);// array list after removed all elements
            System.out.println("Checking the above array list is empty or not! " + c1.isEmpty());//printing empty string statement
        }

    }

