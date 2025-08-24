public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("before handling");
        try{
            int a =10/0;
        } catch (Exception e) {
            System.out.println(e.toString());  //also used //e.getMessage() , e()
        }
        finally {      //always run whether try run or not
            System.out.println("finally hai");
        }
        System.out.println("After handling");
    }
}

      //without try catch wont work


