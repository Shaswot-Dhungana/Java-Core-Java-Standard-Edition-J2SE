import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*
         Question :~ Write a Program to
         detect whether a number entered by 
         the user is integer or not.
         */

         // Scanning input

         Scanner numb = new Scanner(System.in);


         System.out.println("Enter Any Number :~");

         System.out.println(numb.hasNextInt());
         

    }
}