
public class Main{
    public static void main(String[] args) {
        System.out.println("Hellow , I am Batman..");
     System.out.println("Program will sleep for 5 seconds....");
       
     // slepping main thread.....
     try {  Thread.sleep(5000); }
      catch(Exception e){};

      System.out.println("Sleep is over...");

    }
}