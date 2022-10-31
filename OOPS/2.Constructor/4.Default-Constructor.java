public class Main{
    public static void main(String[] args){
       
        myClass myObject = new myClass();

      myObject.printSomething();

        
    }
}

class myClass{

    String name;
    int number;

    /*  No User-Defined Constructor
     in This Class so , Default will 
     work ...
     While Executing this program 0 
     and Null is initialized
     automatically by default Contructor.
  */

  void printSomething(){
    System.out.println("Number is " + number + " And Name is " + name);
  }
   
}