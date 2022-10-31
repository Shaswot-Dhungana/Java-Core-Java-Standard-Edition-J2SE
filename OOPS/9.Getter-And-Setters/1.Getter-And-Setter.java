import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner
        Scanner scanData = new Scanner(System.in);

        String player1, player2;
        System.out.println("Enter Name of First Player :~");
        player1 = scanData.next();

        System.out.println("Enter Name of Second Player :~");
        player2 = scanData.next();

        
         // Object of Players Class
        Players p1 = new Players();

        p1.setName(player1);

        System.out.println("Name of First Player is " + p1.getName());

        p1.setName(player2);

        System.out.println("Name of Second Player is " + p1.getName());
    }
}

class Players {
    private String name;

    // Setter , Takes Argument , No return

    void setName(String playerName) {
        name = playerName;
    }

    // Gettter , Return Data

    String getName() {
        return name;
    }

}