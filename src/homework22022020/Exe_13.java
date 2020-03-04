package homework22022020;

import java.util.Scanner;

public class Exe_13 {
    /*
    Write a Java program which input any number between 1 to 7 and it print The Days name MONDAY,
    TUESDAY…..SUNDAY of the week accordingly by using switch. NOTE:
    if number is out of selection Print message “Week contains 1 to 7 days”
     */

    public static void main(String[] args) {//main method
        Exe_13 obj = new Exe_13();//object creation
        obj.weekdays();
    }

    public void weekdays(){//instance method

        Scanner scan = new Scanner(System.in);//scanner class
        System.out.println("Please Enter Number of the Day : ");//printing statement
        int day = scan.nextInt();
        scan.close();

        switch (day){
            case 1:
                System.out.println(" it's Monday");
                break;
            case 2:
                System.out.println("it's Tuesday");
                break;
            case 3:
                System.out.println("it's Wednesday");
                break;
            case 4:
                System.out.println("it's Thursday");
                break;
            case 5:
                System.out.println("it's Friday");
                break;
            case 6:
                System.out.println("it's Saturday");
                break;
            case 7:
                System.out.println("it's Sunday");
                break;
            default:
                System.out.println("Week Contains only 1 to 7 Days");


        }

    }

}
