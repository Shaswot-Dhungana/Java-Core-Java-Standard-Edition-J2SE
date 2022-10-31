import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*
        Question :~ Write a program to
        sum three number in java. 
         */

         // scanning data from user
         
         Scanner scanData = new Scanner(System.in);

double a,b,c,sum;

         System.out.println("Enter First number :~ ");
a = scanData.nextDouble();

System.out.println("Enter Second number :~ ");
b = scanData.nextDouble();

System.out.println("Enter Third number :~ ");
c = scanData.nextDouble();

// adding these 3 numbers

sum = a +b +c;
System.out.println("Sum of Those 3 Numbers is :~ " +sum);

    }
}