public class Main {
    public static void main(String[] args) {

        /*
         * Array is a collection of
         * Similar types of data
         */

        // Ways to declare array and allocate memory location {Memory Allocation}

        // First Way.

        int[] marks1 = new int[5];  // Declaration + Memory Allocation.

        marks1[0] = 10;
        marks1[1] = 20;
        marks1[2] = 30;
        marks1[3] = 40;
        marks1[4] = 50;

        System.out.println(marks1[3]);

       // Second Way

       int [] marks2; // Declaration
       marks2 = new int[5]; // Memory Allocation


       marks2[0] = 60;
       marks2[1] = 70;
       marks2[2] = 80;
       marks2[3] = 90;
       marks2[4] = 100;

System.out.println(marks2[3]);
       // Third Way 

       int [] marks3 = {110,120,130,140,150};   // Declare + initialiZe

System.out.println(marks3[3]);


System.out.println(marks1.length);
System.out.println(marks2.length);
System.out.println(marks3.length);     

    }
}
