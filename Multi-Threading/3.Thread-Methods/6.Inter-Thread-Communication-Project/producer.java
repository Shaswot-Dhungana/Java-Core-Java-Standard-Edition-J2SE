
class Producer extends Thread {
    company c;

    Producer(company c) {
        this.c = c;
    }

    public void run() {
while(true){
    this.c.produce_item(i);
   try { Thread.sleep(500); }
   catch(Exception e){};
    i++;
}
    }
}