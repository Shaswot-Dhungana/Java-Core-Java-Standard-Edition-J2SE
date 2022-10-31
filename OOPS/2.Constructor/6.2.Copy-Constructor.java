public class Main{
    public static void main(String[] args) {
       
        /*  copying values of Parameterized Constructor
    using Copy Constructor 
    */ 

    A object1 = new A(3 , 7);

    A object2 = new A(object1);

    }
}


class A{
    int m,n;
    A(int a , int b){
      m = a;
      n = b;
      System.out.println("This is a Parameterized Constructor");
System.out.println(m + " " + n);
    }

    

    // Copy Constructor of Parameterized Constructor
// object 2 = referenceVariable , due to [ A object2 = new A(object1); ] this Object.

    A(A referenceVariable){
        int x,y;

x = referenceVariable.m + 7;
y = referenceVariable.n + 3;

System.out.println("This is a Copy Constructor of Parameterized Constructor");
System.out.println(x + " "  + y);
    }


}