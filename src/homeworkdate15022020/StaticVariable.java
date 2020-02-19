package homeworkdate15022020;

public class StaticVariable {// class
    static int a = 150; //static variable
    static int b = 100; //static variable

    public static void main(String[] args) {//main method
        //StaticVariable.numbers(); //static method calling to main method using class name
        numbers(); //static method calling to main method with direct method name
    }

    //static method
    static void numbers() {
        System.out.println("A is: " + a); //static variable to static method direct access
        System.out.println("B is: " + b); //static variable to static method direct access

    }


}
