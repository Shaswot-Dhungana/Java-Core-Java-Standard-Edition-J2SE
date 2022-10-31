public class Main{
    public static void main(String[] args) {
        
        A obj = new A();

        obj.id = 01;
        obj.name = "Lord Shiva";

        System.out.println(obj.id + " " + obj.name);

    }
}

public class A{
     int id; // Default Access
    String name; // Default Access

    
}


/*  WE can use Default modifiers with in 
a class and package .
*/