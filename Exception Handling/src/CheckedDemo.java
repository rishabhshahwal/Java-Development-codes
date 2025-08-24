import java.io.*;


public class CheckedDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try{
            //FileReader file=new FileReader("rishu");
            fis = new FileInputStream("rishu.txt");

        } catch (IOException e)
        {
            System.out.println("Error reading file");
            System.exit(0);
        }
        finally{
            //file.close();
            System.out.println("finally");
        }
    }
}
