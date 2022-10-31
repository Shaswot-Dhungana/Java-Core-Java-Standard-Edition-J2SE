
public class Main {
    public static void main(String[] args) {
        System.out.println("Program Executed.....");

        int x = 5 + 15;

        System.out.println("Sum is :~ " + x);

        // printing Thread name of Main Thread..

        Thread t = Thread.currentThread();
        String tName = t.getName();
        System.out.println("Name of Main Thread :~ " + tName);

        System.out.println("Program Terminated...");
    }

}
