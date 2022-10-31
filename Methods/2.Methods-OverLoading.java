public class Main {
    public static void main(String[] args) {

        /*
         * Two or More methods can
         * have same name but
         * different parameters , such
         * methods are called
         * Method overloading.
         * 
         * Method Over Loading Cannot
         * be Performed by changing
         * the return type of methods
         * or Data Type of Methods.
         * 
         */

        // Calling Functions

        foo();
        foo(100);
        foo(200, 300);

    }

    static void foo() {
        System.out.println("Hellow Mr.Stark");
    }

    static void foo(int a) {
        System.out.println("Hellow Mr.Stark " + a);
    }

    static void foo(int a, int b) {
        System.out.println("Hellow Mr.Stark " + a + " " + b);
    }

}