package homeworkdate15022020;

public class TwoInstanceVariable {//public class
    int a = 25; //instance variable
    int b = 50; //instance variable

    public static void main(String[] args) {//main method
        TwoInstanceVariable two = new TwoInstanceVariable();//object created to call instance method
        two.number();

    }

    //instance method
    public void number() {
        //int a = 25; // instance variable
        // int b = 50; // instance variable
        System.out.println("A is:" + a); // printing statement
        System.out.println("B is:" + b); // printing statement


    }


}
