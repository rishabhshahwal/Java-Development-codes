package Synchronization;

public class TablePrintWithMethod {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+(n * i));
            try {
                Thread.sleep(500);
            }
             catch (InterruptedException e)
             {
                 e.printStackTrace();
             }
        }
    }
}
