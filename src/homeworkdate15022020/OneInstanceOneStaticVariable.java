package homeworkdate15022020;

public class OneInstanceOneStaticVariable {//class name
    int a = 100; // instance variable

    static int b = 200; //static variable

    public static void main(String[] args) {//main method
        OneInstanceOneStaticVariable one1 = new OneInstanceOneStaticVariable();//object created to call instance method
        one1.one();
        //OneInstanceOneStaticVariable.ones();//static method called by using class name as well
        one2(); //static to static method we can call direct as well in main method
    }

    //instance method
    public void one() {
        System.out.println(a);//accessing instance variable directly as instance method
        System.out.println(OneInstanceOneStaticVariable.b);//accessing static variable in instance variable
        // using class name


    }

    //static method
    public static void one2() {
        OneInstanceOneStaticVariable ob = new OneInstanceOneStaticVariable();//accessing instance variable to static method creating object
        System.out.println(ob.a); //using ob reference printing instance variable
        System.out.println(b);//calling static variable to static method directly

    }

}
