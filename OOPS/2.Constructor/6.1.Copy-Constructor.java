class Main{
public static void main(String[] args) {
    
    /*  copying values of Default Constructor
    using Copy Constructor 
    */ 



    A object1 = new A();
A object2 = new A(object1); // Copying Values of Object1 in Object2

}
}


class A{
int a; String b;
    A(){
a = 100;
b = "Hellow,World!!!";

System.out.println("This is Constructor " + a + " " + b );
    }

    // Copy Constructor
    // A is class name and ref is Reference Variable , here ref = object1.
    
    A(A ref){
        int x; String y;

x = ref.a + 50;
y = ref.b;

System.out.println("This is Copy Constructor " + x + " " + y );

    }
}