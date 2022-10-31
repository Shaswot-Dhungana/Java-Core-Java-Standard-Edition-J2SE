
public class Main{
    public static void main(String[] args) {
        
        Thread t = Thread.currentThread();
       System.out.println("Main Thread id is :~ " +t.getId());

// object of user defined thread and 
// starting user defined thread...

       myThread obj1 = new myThread();
       obj1.start();

    }
}

// user defined thread 
class myThread extends Thread{
    
    public void run(){
      
        System.out.println("User-Defined Thread iD is :~ "+currentThread().getId());
    }

}