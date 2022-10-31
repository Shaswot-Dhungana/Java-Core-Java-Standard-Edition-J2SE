class Main{
    public static void main(String[] args) {
        
       Dog obj1 = new Dog();
       Lion obj2 = new Lion();

       obj1.sound();
       obj2.sound();

    }
}

abstract class Animals{

    public abstract void sound();
}


class Dog extends Animals{
public void sound(){
    System.out.println("Dog : Bark");
}
}

class Lion extends Animals{
    public void sound(){
        System.out.println("Lion : Roar");
    }
}