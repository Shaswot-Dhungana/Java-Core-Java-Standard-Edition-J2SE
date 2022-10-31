class A{
    // this keyword refers to the same object of the class.
    void show(){
        System.out.println(this); 
        System.out.println("Both Reference id is same so \n we can say that they both \n refers to the same object \n of the class.");
    }
    public static void main(String[] args) {
        
        A r = new A();
        System.out.println(r);
r.show();
    }
}