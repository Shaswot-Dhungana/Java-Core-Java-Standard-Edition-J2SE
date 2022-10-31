
class MAIN{
    public static void main(String[] args) {
        
        MAIN.sum(new int[][] {{1,2,3},{4,5,6}});

    }

    static void sum(int[][] n){
int total=0;

for (int i[] : n) {
    for(int j:i){
total=total+j;

    }
    
}
System.out.println("sum of elements of anonymous array are :~ "+total);
    }

}