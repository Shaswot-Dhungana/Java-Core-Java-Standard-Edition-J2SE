import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       

        Scanner scanData = new Scanner(System.in);

        int a,b,sum;
        System.out.println("Enter First Number :~");
        a = scanData.nextInt();
        System.out.println("Enter Second Number :~");
        b = scanData.nextInt();

        sum = calc(a, b);
        System.out.println("Sum of Those Numbers is "+sum);

    }

        static int calc(int x, int y){

            int sum;
            sum = x + y;
            return sum;

        }


  
}