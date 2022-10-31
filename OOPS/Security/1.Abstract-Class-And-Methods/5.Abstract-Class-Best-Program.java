public class Main{
    public static void main(String[] args) {
        car objCar = new car();
        objCar.startWith();
        objCar.noOfTyres();

        bike objBike = new bike();
        objBike.startWith();
        objBike.noOfTyres();
    
    }
    }


abstract class Vehicles{
   abstract void noOfTyres();
    abstract void startWith();
}

class car extends Vehicles{
 void noOfTyres(){
    System.out.println("It has 4 Tyres");
 }
    void startWith(){
        System.out.println("Car Start With Key,Auto Start");
    }
}

class bike extends Vehicles{
void noOfTyres(){
    System.out.println("It has Two Tyres.");
}
void startWith(){
    System.out.println("Bike Start with key , kick start.");
}
}


