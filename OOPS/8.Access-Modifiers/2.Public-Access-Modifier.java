public class Main{
    public static void main(String[] args) {
        
        A obj = new A();

        obj.id = 01;
        obj.name = "Lord Shiva";

        System.out.println(obj.id + " " + obj.name);

    }
}

public class A{
    public int id; // public Access
    public String name; // public Access

    
}

/*  WE can use Public modifiers with in 
a class , package , subClass and World.
*/