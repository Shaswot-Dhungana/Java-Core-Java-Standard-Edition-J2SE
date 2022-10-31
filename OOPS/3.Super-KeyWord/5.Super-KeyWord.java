public class Main {
    public static void main(String[] args) {
        // when super class has Parameterized Constructor
        B obj = new B();
    }
}

class A {

    A(int x) {

        System.out.println("This is inside Super Class " + x);

    }
}

class B extends A {

    B() {
        super(100);

        System.out.println("this is sub class ");
    }
}