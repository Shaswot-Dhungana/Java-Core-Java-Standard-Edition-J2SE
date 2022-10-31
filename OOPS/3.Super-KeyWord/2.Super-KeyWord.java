public class Main {
    public static void main(String[] args) {

        // Super Keyword ( accessing Variables using super keyword)

        B obj = new B();
        obj.test();

    }
}

class A {
    int a = 20;
}

class B extends A {
    int a = 10;

    void test() {
        System.out.println(a);
        System.out.println(super.a);
    }
}
