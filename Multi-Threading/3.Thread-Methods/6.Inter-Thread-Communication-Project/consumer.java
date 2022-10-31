
class Consumer extends Thread{
  company c;

  Consumer(company c){
    this.c = c;
  }

    public void run(){
while(true){
    this.c.consume_item();
    try {Thread.sleep(500);}
    catch(Exception e){};
    
}
    }
}