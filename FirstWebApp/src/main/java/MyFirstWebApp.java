import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFirstWebApp extends GenericServlet {


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       res.setContentType("type/html");
        PrintWriter out=res.getWriter();
        out.print("<h2> Hello from rishabh </h2>");
    }
}
