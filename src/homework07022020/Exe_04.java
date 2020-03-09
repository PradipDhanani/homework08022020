package homework07022020;

import java.util.ArrayList;
import java.util.List;
/*
 Write a Java program to retrieve an element (at a specified index) from a given array list
 */

public class Exe_04 {//class
        public static void main(String[] args) {
            // Crete a list and add some names to the list
            List<String> list_Strings = new ArrayList<>();//array list object creation
            list_Strings.add("Bhavesh");//list arrays
            list_Strings.add("Srinivas");//list arrays
            list_Strings.add("Chaitnya");//list arrays
            list_Strings.add("Ankita");//list arrays
            list_Strings.add("Lamee");//list arrays

            System.out.println(list_Strings);//printing list
            // finding first and third element
            String element = list_Strings.get(0);//array index start from 0 and count as 1
            System.out.println("First element: "+element);//printing first element
            element = list_Strings.get(2);//array index start from 0 and count as 1
            System.out.println("Third element: "+element);//printing statement
        }

    }

