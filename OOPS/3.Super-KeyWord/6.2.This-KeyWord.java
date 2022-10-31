class A{
int a; // Instance Variable
    A(int a /*LOcal Variable*/){
System.out.println(a);
  this.a = a + 5;
// here this.a is instance variable and "a" is LOcal Variable.
    }

    void show(){
System.out.println(a);
    }
    public static void main(String[] args) {
        A obj = new A(100);
obj.show();

    }
}