/*  Static Block dont need object ,
 it runs automatically when compiling/Running program..
 Static Block Only Access Static Variables.
*/


class A{
static int a = 100;

    A(){
System.out.println("This is Constructor...");
    }

    static{   // Static Block
System.out.println("This is Static Block... " + a);
    }

    public static void main(String[] args) {
        A objj = new A();
    }
}