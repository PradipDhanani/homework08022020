package homework29022020;

/*
 Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
 */
public class Exe_8 {//class

    public static void main(String[] args) {//main method
        nested();//calling static method to main method
    }

    public static void nested() {//static method
        int i, j;//local variable
        System.out.println("The Right angle Triangle of @ is as below:\n");//printing statement
        for (i = 1; i <= 5; i++) {//for loop condition

            for (j = 1; j <= i; j++) {//for loop condition

                System.out.print(" @ ");//printing statement
            }
            System.out.println(" ");//printing statement
        }


    }


}

