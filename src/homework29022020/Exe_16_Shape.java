package homework29022020;

/*
Understanding the real scenario of Abstract class
 */
abstract class Exe_16_Shape {//abstract class

    public abstract void draw();//abstract method
}

class Rectangle extends Exe_16_Shape {//extends parent class to child class

    public void draw() {//instance method
        System.out.println("Drawing rectangle");//printing statement
    }
}

class Circle1 extends Exe_16_Shape {//extends parent class to child class

    public void draw() {//instance method
        System.out.println("Drawing circle");//printing statement
    }
}

class TestAbstraction1 {//class

    public static void main(String[] args) {//main method
        Exe_16_Shape e = new Circle1();//object created for circle1 class
        e.draw();//calling method

    }


}




















