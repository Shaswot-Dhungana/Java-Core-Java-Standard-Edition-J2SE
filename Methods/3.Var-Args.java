public class Main{
    public static void main(String[] args){
        
        // Variable Arguments
       
        System.out.println(sum(2,5));
        System.out.println(sum(3,50,96,875,37,9));

    }

    static int sum(int ...arr){
        // Arguments are stored as array in this function.
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;

    }

}