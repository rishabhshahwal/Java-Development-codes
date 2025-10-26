import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("Text/html");
        PrintWriter out = resp.getWriter();

        out.println("<h2>Welcome to CFS</h2>");
        out.println("<p>you can contact at 90090</p>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String course= req.getParameter("course");

        resp.setContentType("text/file");
        PrintWriter out=resp.getWriter();
        out.println("<h2>Student Detail:</h2>");
        out.println("<p>Student name: "+name+"</p>");
        out.println("<p>Student course: "+course+"</p>");
    }
}
