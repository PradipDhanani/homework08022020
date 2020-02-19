package homeworkdate15022020;

public class TwoInsTwoStatVariable { //class name
    int a = 10; // instance variable
    int b = 20; // instance variable

    static int c = 30; // static variable
    static int d = 40; // static variable

    public static void main(String[] args) {//main method
        TwoInsTwoStatVariable ref = new TwoInsTwoStatVariable();//object created to call instance method
        ref.call();
        call1();//called direct static method in main static method


    }

    //instance method
    public void call() {
        System.out.println(a); // instance variable calling direct to instance method
        System.out.println(b); // instance variable calling direct to instance method
        System.out.println(TwoInsTwoStatVariable.c);//static variable calling to instance method using class name
        System.out.println(TwoInsTwoStatVariable.d);//static variable calling to instance method using class name

    }     //static method

    public static void call1() {
        TwoInsTwoStatVariable ref1 = new TwoInsTwoStatVariable();//object created calling instance to static
        System.out.println(ref1.a);// printing instance variable
        System.out.println(ref1.b);// printing instance variable
        System.out.println(c); //direct calling static to static and printing
        System.out.println(d); //direct calling static to static and printing


    }


}
