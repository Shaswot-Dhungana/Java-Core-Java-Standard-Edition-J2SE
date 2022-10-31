public class Main {
    public static void main(String[] args) {
        // Super Keyword ( accessing Constructor using super keyword)

        B obj = new B();

    }
}

class A {
    A() {
        System.out.println("This is Super Class.");
    }
}

class B extends A {
    B() {
        // Default Super Keyword will be there if you dont write super keyword.
        super(); // We can Write super keyword for constructor , if we dont write then there will
        // not be any problem , it will call constructor of super class using default
        // super Keyword. but we need to call it manually if our constructor of Super Class is Parameterized.
        

        System.out.println("This is Sub Class");
    }
}