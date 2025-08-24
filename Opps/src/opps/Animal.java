package opps;

class species
{
    void fly()
    {
        System.out.println("flying...");
    }
}


public class Animal extends species {

     void eat()
     {
         System.out.println("opps.Animal is eating..");
     }
      static void sound()
      {
          System.out.println("making sound tree tre");
      }

        @Override
          void fly(){
              System.out.println("not support");
          }
}
class Dog extends Animal
{

    static void sound() {
        System.out.println("bark...");
    }
}
