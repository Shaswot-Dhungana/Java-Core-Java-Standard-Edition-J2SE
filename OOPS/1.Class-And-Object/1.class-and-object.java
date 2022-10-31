// User-Defined Class
class myOwnClass {

    /*
     * Class is Virtual , Memory is not allocated for class.
     * object is Virtual , Memory is allocated for class.
     */

    int age = 19;
    String hairColor = "Black";

    // Function Under User-Defined Class

    void lordShiva() {
        System.out.println("Lord Shiva is God of Gods");
    }

    // Main Function
    public static void main(String[] args) {

        /*
         * Acessing Functions and
         * variables of User-Defined Class
         * in Main Function Via
         * Object.
         */

        myOwnClass obj = new myOwnClass();

        obj.lordShiva();

        System.out.println("My Age is " + obj.age);
        System.out.println("My Hair Color is " + obj.hairColor);
    }
}