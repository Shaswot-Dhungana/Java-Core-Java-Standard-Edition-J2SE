

public class Main{
    public static void main(String[] args) {
        B obj = new B();
    }
}


class A{
    int x = 117;
}

class B extends A{
    B(){
        System.out.println(x);
    }
}