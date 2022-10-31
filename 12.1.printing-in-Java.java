public class Main {
    public static void main(String[] args) {

        /*
         * Different Ways To Print In Java :~
         * 
         * 1. System.out.print() :- No New line at the End.
         * 2. System.out.println() :- New Line AT the end.
         * 3. System.out.printf()
         * 4. System.out.format()
         * 
         * 
         * FORMAT SPECIFYER :~
         * %d for integer.
         * %f for float.
         * %C for character.
         * %s for string.
         * 
         * 
         */

        String god = "Lord Shiva";

        System.out.println("Example of System.out.print(); :~ ");

        System.out.print(god);
        System.out.print("is God Of Gods.");

        System.out.println("  "); // space

        System.out.println("Example of System.out.println(); :~ ");

        System.out.println(god);
        System.out.println("is God Of Gods.");

        System.out.println("  "); // space

        System.out.println("Example of System.out.printf(); :~ ");

        int a = 10;
        float b = 5.9007f;

        System.out.printf("The value of a is %d and value of b is %f", a, b);

        System.out.println("  "); // space

        System.out.println("Example of System.out.format(); :~ ");

        System.out.format("The value of a is %d and value of b is %f", a, b);

        /*
         * System.out.printf(); and System.out.format();
         * works simarly.
         */

    }
}