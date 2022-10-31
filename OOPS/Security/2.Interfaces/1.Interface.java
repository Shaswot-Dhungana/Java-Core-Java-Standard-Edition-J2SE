/*
 * In Interface All methods 
 * inside Abstract class 
 * should be Abstract Methods.
 * 
 * we cant create object of interface.
 */


 public class Main{
    public static void main(String[] args) {
        myClass obj = new myClass();
        obj.show();
        obj.display();
    }
 }

 interface myInterface1{
    public void show();
 }

 interface myinterface2{
    public void display();
 }


// inheritating myinterface in myclass
// Interface Suppors multiple inheritance..

 class myClass implements myInterface1 , myinterface2{

    public void show(){
        System.out.println("this method is from Interface 1.");
    }

    public void display(){
        System.out.println("this method is from Interface 2.");
    }

 }