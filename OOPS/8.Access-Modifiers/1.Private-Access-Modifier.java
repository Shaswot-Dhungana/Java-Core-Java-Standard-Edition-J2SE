public class Main{
    public static void main(String[] args) {
        
A obj = new A();

obj.setData(01, "LordShiva");

obj.printData();
    }
}

class A{
    private int id; // private Access
    private String name; // private Access

    public void setData(int x, String y){
      id = x;
      name = y;
    }

    public void printData(){
        System.out.println(id + " " + name);
    }

}

/*  WE can use Private modifiers with in 
a class.
*/