import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*
        Question :~ Write a java program 
        to convert KiloMetres to Miles. 
         */
        
         // Scanning Input/Data

         Scanner kiloMeter = new Scanner(System.in);


         System.out.println("Enter Kilo Meters :~");

         double km,miles;
         miles = 1.609; // 1km = 1.609 miles

         km = kiloMeter.nextDouble();

         double finalMile;

         finalMile = km * miles;

         System.out.println(km + " km" + " = " + finalMile + " mile");

    }
}