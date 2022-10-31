class A{
    A(){
        System.out.println("I am Default Constructor");
    }

    A(int x){
        this(); // Calling Deafult Constructor of its own class Using This Keyword.
System.out.println("I am Parameterized Constructor " +x);
    }

    public static void main(String[] args) {
        A obj = new A(990);

    }
}