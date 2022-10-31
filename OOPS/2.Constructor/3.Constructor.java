public class Main{
    public static void main(String[] args){
       
        myClass myObject = new myClass();

        myObject.printSentence();

        
    }
}

class myClass{

    String name;

    // Constructor {User-Defined}
    myClass(){

        name = "Bruce Wayne";

    }
    
   void printSentence(){
        System.out.println("Hellow , i am " + name + ".");
    }
}