   /* Encapsulation  */

   class B{
    public static void main(String[] args) {
        A obj = new A();
        obj.setValue(25);
System.out.println(obj.getValue()); // data abstraction
    }
   }

   class A{

    private int value; // data hiding

    public void setValue(int x){
value = x;
    }

    public int getValue(){
        return value;  // data abstraction
    }

   }

