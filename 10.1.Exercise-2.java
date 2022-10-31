import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        /*
         Question :~ Write a program to
         encrypt a grade by adding 9 to it ,
         and decrypt it to show the correct grade.
         */

         // Function to Scan users data

         Scanner scanGrade = new Scanner(System.in);


         

        System.out.println("Enter your Grade which you want to Encrypt.");
double userGrade = scanGrade.nextDouble();

System.out.println("ok , Encrypting Your Grade..");

double salt = 9;
double encryptedGrade;

encryptedGrade = userGrade + salt;

System.out.println("Your Grade is Encrypted . Your New Encrypted Grade is " +encryptedGrade);

double decryptedGrade;

decryptedGrade =  encryptedGrade - salt;



System.out.println("Your Grade is Decrypted . Your Decrypted Grade is " + Math.abs(decryptedGrade));

/* 
Math.abs() -->> this function Convert Negative 
Numbers to Positive Numbers.
*/



    }
}