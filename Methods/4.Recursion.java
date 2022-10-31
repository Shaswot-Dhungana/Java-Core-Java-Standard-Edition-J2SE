public class Main {
    public static void main(String[] args) {

        /*
         * A Function in Java can Call
         * itself . Such Calling of function
         * by itself is known as Recursion...
         */


         // Sun of first Natural Numbers.


Main r = new Main(); // Making object of Class Main

int a = r.sum(5); // calling method/function

System.out.println(a);


    }

int sum(int b){
    if(b>0){
        return b+sum(b-1);
    }else{
        return 0;
    }
}


}