import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

/*1. load the driver class
      2. Get connection from db
      3. create statement
      4. execute query
    * */


    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  //load driver class

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/myemp","root","iamgroot");

            Statement statement=con.createStatement();
            String query = "select * from emplyee";

            ResultSet rs = statement.executeQuery(query);
            System.out.println("__________Read Data____________");
            while(rs.next())
            {
                System.out.println(
                        rs.getInt("id")+ " | "+
                                rs.getString("empName")+" | "+
                                rs.getInt("age")
                );
            }
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}