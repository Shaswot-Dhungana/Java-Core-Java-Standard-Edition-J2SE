import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        
        // Taking Input from Users Keyboard.
        
        Scanner scanData = new Scanner(System.in);

        int a;
        int b;

System.out.println("Enter First Number :~");
a = scanData.nextInt();

System.out.println("Enter Second Number :~");
b = scanData.nextInt();

int sum = a + b;
System.out.println("Sum of 2 Number is");
System.out.println(sum);



    }
}
