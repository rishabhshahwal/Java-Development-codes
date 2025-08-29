
 class EvenThread extends Thread
 {
     @Override
     public void run() {
         for (int i = 2; i <= 10 ; i=i+2) {
             System.out.println("even : "+1);
         }
     }
 }
 class OddThread extends Thread
 {
     @Override
     public void run() {
         for(int i=1;i<=9;i=i+2)
         {
             System.out.println("odd: "+i);
         }
     }
 }

public class EvenOdd {
    public static void main(String[] args) {
        new EvenThread().start();    //instead this much we can write this
        new OddThread().start();

         /*EvenThread e=new EvenThread();
            e.start();*/
    }
}
