import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    

    /* 
    Question :~ Write  a program to calculate
    percentage of a given student in exam .
    His/Her marks of 5 subject must be 
    taken as input from the keyboard.
    */ 


    // Scan Users input

    Scanner userMarks = new Scanner(System.in);


    // Asking For Full Marks of Each Subject.

    double fullScience, fullMath, fullEnglish, fullSocial, fullMoral, totalFullMarks;


    System.out.println("Enter full Mark of Science :~");
fullScience = userMarks.nextDouble();

System.out.println("Enter full Mark of Maths :~");
fullMath = userMarks.nextDouble();

System.out.println("Enter full Mark of English :~");
fullEnglish = userMarks.nextDouble();

System.out.println("Enter full Mark of Social :~");
fullSocial = userMarks.nextDouble();

System.out.println("Enter full Mark of Moral :~");
fullMoral = userMarks.nextDouble();

totalFullMarks = fullScience +fullMath +fullEnglish +fullSocial +fullMoral;



    // Asking Users for their marks

    double science, math, english, social, moral , totalMarksGotByUser;


    System.out.println("Enter Marks You Got in Science :~");
science = userMarks.nextDouble();


System.out.println("Enter Marks You Got in maths :~");
math = userMarks.nextDouble();

System.out.println("Enter Marks You Got in english :~");
english = userMarks.nextDouble();

System.out.println("Enter Marks You Got in Social :~");
social = userMarks.nextDouble();

System.out.println("Enter Marks You Got in Moral :~");
moral = userMarks.nextDouble();


totalMarksGotByUser = science +math +english +social +moral;


// Arithematic Calculations.

double percentageGotByUser;

percentageGotByUser = (totalMarksGotByUser/totalFullMarks)*100;

System.out.println("Your Percentage is :~ " +percentageGotByUser );

    }
}