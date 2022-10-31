class A{

    A(){
this(199); // Calling Parameterized Constructor Without Making Object using this.
    }

    A(int y){
System.out.println(y);
    }


    public static void main(String[] args) {
        A obje = new A();

    }

}