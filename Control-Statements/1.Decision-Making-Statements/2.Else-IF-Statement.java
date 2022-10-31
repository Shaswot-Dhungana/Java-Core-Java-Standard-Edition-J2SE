import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanning Users input

        Scanner scanNum = new Scanner(System.in);

        int num;
        System.out.println("Enter Any Number Ranging From 0 to 50 :~");
        num = scanNum.nextInt();

        if (num >= 0 && num <= 10) {
            System.out.println("You Have Entered Number ranging from 0 to 10");
        } else if (num > 10 && num <= 20) {
            System.out.println("You Have Entered Number ranging from 10 to 20");
        } else if (num > 20 && num <= 30) {
            System.out.println("You Have Entered Number ranging from 20 to 30");
        } else if (num > 30 && num <= 40) {
            System.out.println("You Have Entered Number ranging from 30 to 40");
        } else if (num > 40 && num <= 50) {
            System.out.println("You Have Entered Number ranging from 40 to 50");
        } else {
            System.out.println("You Have Entered Invalid Data !!!!");
        }

    }
}