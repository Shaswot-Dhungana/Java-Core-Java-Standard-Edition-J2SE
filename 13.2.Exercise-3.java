import javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener;

public class Main{
    public static void main(String[] args){


        /*
         Question :~ Write a program to 
         detect double and triple spaces in a
         string.
         */

         String myString = "This String Contains  Double and    triple spaces.";
        

   int doubleString = myString.indexOf("  ");    
    int tripleString = myString.indexOf("   ");
         
        System.out.println("Double String is in index Number " +doubleString);
        System.out.println("Triple String is in index Number " +tripleString);


    }
}