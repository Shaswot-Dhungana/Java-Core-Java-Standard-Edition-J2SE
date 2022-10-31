
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

int a;
int i = 1;


Scanner scanData = new Scanner(System.in);

System.out.println("Enter Any Number :~");
a = scanData.nextInt();

        do {
        System.out.println(i);
        i++;
        } while (a>=i);

    }
}