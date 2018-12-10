import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/count")
public class HelloWorldServlet extends HttpServlet {
    public static int count = 1;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws java.io.IOException{
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String phoneNumber = req.getParameter("phoneNumber");
        res.setContentType("text/html");
        PrintWriter out = null;
        try {
            out = res.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.println("<h1> Your name is "+ name + "</h1>" + "<br>"
                + "<br>" + "<p> Your phone number is "+ phoneNumber + "</p>"
                + "<br>" + "<p> Your address is "+ address + "</p>"
                + "<br>" + "<p> This website has been visited " + count + " times");
        count++;
    }
}
