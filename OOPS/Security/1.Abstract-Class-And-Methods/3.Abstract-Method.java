public class Main {
    public static void main(String[] args) {

        B obj1 = new B();
        obj1.myMethod();
        obj1.myMethod2();

    }
}

/*
 * A method that is declared
 * without an implementation is
 * known as abstract method.
 */

// super class / parent class
abstract class A {
    abstract void myMethod();

    abstract void myMethod2();

}

// sub classs / child class

class B extends A {
    void myMethod() {
        System.out.println("hii");
    }

    @Override
    void myMethod2() {
        System.out.println("Hellow User,,");

    }
}
