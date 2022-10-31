class Main{
public static void main(String[] args) {
    
    A object = new A(2,3);

    object.show();

}
}



class A{
    int x; int y;

    A(int a, int b){
 x=a;
y=b;
    }

    void show(){
        System.out.println(x + " " + y);
    }
}
