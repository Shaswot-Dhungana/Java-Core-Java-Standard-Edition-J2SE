// Multi Threading  using Thread Class

class myNewClass extends Thread{
public void run(){
    // task for thread
    for(int i=20; i>=0; i--){
        System.out.println("Value of i is :~ " + i);
try { Thread.sleep(500); }
catch(Exception e){}
    }
}




    public static void main(String[] args) {
        
        // object of thread class
        myNewClass th2 = new myNewClass();
        th2.start();

    }




}
