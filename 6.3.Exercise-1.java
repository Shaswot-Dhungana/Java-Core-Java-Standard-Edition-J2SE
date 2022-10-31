import java.util.Scanner;

public class Main{
        public static void main(String[] args){

            /*
            Question :~ write a program which 
            asks the user his/her name and greet him/her 
            with "Hello , <name> , have a good day" text. 
             */
            

             // Scanning data from keyboard

             Scanner userName = new Scanner(System.in);

             System.out.println("Enter Your Name :~");

             String name;

             name = userName.next();

             System.out.println("Hellow, " + name + ", have a Good Day.. ");




        }
    }