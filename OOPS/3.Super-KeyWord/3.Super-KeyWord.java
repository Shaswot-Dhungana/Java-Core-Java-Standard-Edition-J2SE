public class Main{
    public static void main(String[] args) {
               // Super Keyword ( accessing Method/Function using super keyword)
        B obj = new B();
        obj.test();
        
    }
}

class A{
    void test(){
        System.out.println("This will be called by using Super Keyword from Sub Class.");
    }
}


class B extends A{
    void test(){
        super.test();
        System.out.println("This is Sub Class.");
    }
}

