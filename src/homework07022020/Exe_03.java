package homework07022020;

import java.util.ArrayList;
import java.util.Iterator;

public class Exe_03 {//class
    /*
     Write a Java program to iterate through all elements in a array list.
     */
    public static void main(String[] args) {//main method

        //ArrayList object
        ArrayList<String> arrayList = new ArrayList<>();

        //Added elements to Arraylist
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        //Iterator object for Array List using iterator() method.
        Iterator<String> itr = arrayList.iterator();

        //use hasNext() and next() methods of Iterator to iterate through the elements
        System.out.println("Iterating through ArrayList elements...");//printing statement
        while (itr.hasNext())//while loop
            System.out.println(itr.next());//printing statement

    }

}
