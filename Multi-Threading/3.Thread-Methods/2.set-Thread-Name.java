
public class Main{
    public static void main(String[] args) {
        
        // printing current thread name.
        Thread t1 = Thread.currentThread();
        String firstThread = t1.getName();
        System.out.println("Current Thread is :~ " +firstThread);

        // Changing Name of Main/Current Thread 

        t1.setName("Thread-Nepal");
Thread t2 = Thread.currentThread();
String secondThread = t2.getName();
System.out.println("Current Modified Thread is :~ " +secondThread);



    }
}