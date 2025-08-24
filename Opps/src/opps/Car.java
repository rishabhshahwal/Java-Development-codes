package opps;

public class Car {

    //field , attribute,properties
    String color;
    String brand;
    int speed;  //instance

    public static void main(String[] args) {
        Car car1 = new Car();

        //we need ro set speed value
        car1.speed=100;
        car1.run();


    }
        //behaviour (method) //action

       public void run()
       {
           System.out.println("opps.Car is running at " + speed);
       }

}
