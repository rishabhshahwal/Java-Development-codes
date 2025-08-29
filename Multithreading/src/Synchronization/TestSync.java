package Synchronization;

public class TestSync {
    public static void main(String[] args) {
        System.out.println("..........sync method.........");
        TablePrintWithMethod t=new TablePrintWithMethod();
        Thread t1=new Thread1(t);
        Thread t2=new Thread1(t);

        t1.setName("t1-thread");
        t2.setName("t2-thread");

        try
        {
            System.out.println("main thread waiting");
            t1.join();
            t1.join();
            System.out.println("Main thread completed");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
