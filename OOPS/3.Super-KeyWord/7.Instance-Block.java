// Instance Block is Called Before Constructor.
// Instance Block can access Both Static Variable and Non-Static Variable.;
class A {
int x = 990; 
static int y = 880;
    A(){
        System.out.println("Instance Block is Called Before Constructor..");
    }

    { // Instance Block
        System.out.println("hello Dear User , I Love You !!!! " + x +" "+ y);
    }

    public static void main(String[] args) {
        A object77 = new A();

    }

}