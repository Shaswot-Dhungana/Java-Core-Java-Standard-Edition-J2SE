import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanning users data

        Scanner scanData = new Scanner(System.in);

        System.out.println("Choose 5 or 10 :~");
        int data;
        data = scanData.nextInt();

        switch (data) {
            case 5:
                System.out.println("You have choosed 5.");
                break;

            case 10:
                System.out.println("You Have Choosed 10.");
                break;

                default:
                System.out.println("You have choosed Invalid Option.!!!!");
        }

    }
}