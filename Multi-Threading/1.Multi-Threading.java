// Multi Threading  using runnable Interface

class MyThreadClass implements Runnable{

    // bluePrint of Threading
public void run(){
    // task for thread
   for(int i=1; i<=10; i++){
    System.out.println("Value of i is :~ " + i);
    // sleeping for 1000 milliseconds...
   try{ Thread.sleep(1000); }
   catch(Exception e){ }
   }
}

// main method / function.....
public static void main(String[] args) {
    // creating object of MyThreadClass
    MyThreadClass obj1 = new MyThreadClass();

    Thread th = new Thread(obj1);
    th.start();

  
}


}
