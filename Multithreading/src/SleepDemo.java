
  class SleepThread extends Thread
  {
      @Override
      public void run() {
          for (int i=0;i<=5;i++)
          {
              System.out.println(getName()+"..."+i);
              try{
                  Thread.sleep(1000);  //1sec\
              }catch(InterruptedException e) {
                  System.out.println("Thread interrupted");
              }
          }
      }
  }

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        SleepThread t1=new SleepThread();
        t1.setName("child");
        t1.start();
    }
}
