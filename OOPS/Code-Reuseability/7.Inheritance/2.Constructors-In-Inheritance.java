public class Main{
    public static void main(String[] args) {
        
        // A obj1 = new A();

        B obj2 = new B();
        /*
         if we amke object of subClass then Constructor of
         super class gets executed first and then Constructor 
         of Subs Class Get Executed........
         */
        

    }
}

// Super Class
class A{
A(){
    System.out.println("I am constructor of Super Class");
}
    
}

// Sub Class
class B extends A{
    B(){
System.out.println("I am constructor of Sub Class");
    }
}