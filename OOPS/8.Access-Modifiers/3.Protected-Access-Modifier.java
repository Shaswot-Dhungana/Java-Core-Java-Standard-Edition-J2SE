public class Main{
    public static void main(String[] args) {
        
        A obj = new A();
obj.printData();

B obj2 = new B();


    }
}

class A{
protected int a = 100;

void printData(){
    System.out.println("Acessing from Same Class" + " " +a);
}
}

class B extends A{
    B(){
        System.out.println("Acessing from Sub Class" + " " +a);
    }
}






/*  WE can use Protected modifiers with in 
a class , package and subClass.
*/