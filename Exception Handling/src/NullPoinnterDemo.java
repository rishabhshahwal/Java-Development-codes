public class NullPoinnterDemo {
    public static void main(String[] args) {
        String s=null;
        try {
            int length = s.length();
        }
        catch (NullPointerException e)  //ya to  parents rakho
        {
            System.out.println("NullPointerException");
        }

        //Exception mismatch
    }
}
