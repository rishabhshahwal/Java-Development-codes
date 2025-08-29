package Synchronization;

public class MyThread extends Thread{
    TablePrintWithMethod t;
    MyThread(TablePrintWithMethod t)
    {
        this.t=t;
    }

    @Override
    public void run() {
        t.printtable(5);
    }
}

