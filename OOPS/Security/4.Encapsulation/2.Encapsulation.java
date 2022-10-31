class A{
public static void main(String[] args) {

    B myObj = new B();

    // System.out.println(myObj.country); // country is a  private variable so cannot access it directly from other class

System.out.println(" Most Beautiful Country of the World is " + myObj.passData() + ".");

}
}

class B{
 private String country = "Nepal";


String passData(){

    String x = country;
    return x;
}

}