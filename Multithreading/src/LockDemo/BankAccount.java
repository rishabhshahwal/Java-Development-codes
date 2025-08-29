package LockDemo;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int bal=10000;
    private final ReentrantLock r1=new ReentrantLock();

    //1.5 sync
    public void withdraw(String threadName,int amount)
    {
        System.out.println(threadName + "is trying to withdraw" +amount);
        //r1.lock();
        if (r1.tryLock())
        {
           r1.lock();
           try{
               System.out.println(threadName+ "acquire lock");
               if (bal>=amount)
               {
                   Thread.sleep(2000);
                   bal=bal-amount;
                   System.out.println("withdrawn :  "+amount+ " remainng "+bal);
               }
               else{
                   System.out.println("insufficient balance");
               }
           }    catch (InterruptedException e){
               throw new RuntimeException(e);
           }
           finally {
               r1.unlock();
           }
        }
        else{
            System.out.println(threadName+ "let me do some other task");
        }
    }
}
