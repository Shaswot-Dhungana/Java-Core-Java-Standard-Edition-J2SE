import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      
        Scanner scanAge = new Scanner(System.in);
        
        int age;

        System.out.println("Enter Your Age :~");
age = scanAge.nextInt();



        if(age >= 18 && age<60){

            System.out.println("Congrats , You are  Eligible for Applying Driving License.");

        }else{
            System.out.println("Sorry You are not Eligible for Applying Driving License.");
        }

    }
}