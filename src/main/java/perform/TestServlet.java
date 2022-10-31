package perform;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  

@WebServlet("/TestServlet")  
public class TestServlet extends HttpServlet {  
    private static final long serialVersionUID = 1L;  
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        // Create a queue of capacity 10 
        Queue q = new Queue(10);
        
        x = 1;
        
        if (request.getParameter("button1") != null) {
            Queue.queueEnqueue(x);
            x++;
        } else if (request.getParameter("button2") != null) {
            Queue.queueDisplay();
        }
    }
} 