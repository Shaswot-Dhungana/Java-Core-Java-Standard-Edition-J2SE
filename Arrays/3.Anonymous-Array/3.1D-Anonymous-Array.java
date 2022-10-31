// annonymous array are only for
//  single time use.

class Main{
    public static void main(String[] args) {

        // anonymous array
        Main.sum(new int[]{5,10,15});
        

    }

    // taking anonymous array as a argument in next function / method.
    
    static void sum(int[] n){
        // printing elements of annonymous array
int total=0;
for(int i:n){
    total = total+i;
    System.out.println("Elements of Anonimous array are :~ "+total);
}
System.out.println("Sum of Array is :~ "+total);
    }
}