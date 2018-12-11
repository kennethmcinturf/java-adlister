import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;


@WebServlet(name = "ViewProfileServlet", urlPatterns = "/guess")
public class GuessPageServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guessNumber.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        String number =  req.getParameter("number");
        int numberToInterger = Integer.parseInt(number);
        String message;
        if (numberToInterger < 1 || numberToInterger > 100){
            message = "Number not in range";
        }else if (numberToInterger < n){
            message = "number to low";
        }else if (numberToInterger > n){
            message = "number to high";
        }else {
            message = "number to high";
        }
        req.setAttribute(message, resp);
        resp.sendRedirect("/numberResult.jsp");
    }

}

