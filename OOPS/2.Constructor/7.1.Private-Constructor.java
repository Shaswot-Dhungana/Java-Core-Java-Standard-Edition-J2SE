
class class1{
    int a,b;

    /* Private Constructor..
     We cant acess Private Constructor
      from Outer Class, we can access it from 
      same class..
    */ 
     private class1(){
        a = 90;
        b = 70;
        System.out.println(a + " " + b);
    }


/*  This main function should be inside 
same class to access that private constructor.
*/
    public static void main(String[] args) {
        
          /*
     directly Accessing Private Constructor,
     this is little bit unsecure.
     */
        class1 object = new class1();

    }


}