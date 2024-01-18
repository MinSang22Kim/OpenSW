import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLRecoverableException;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpRequest request, HttpResponse response) throws ServletElement {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML><BODY>");
        out.println("Seesion test<br>");

        HttpSession session = request.getSession();
        if(session.isNew()){
            out.println("This is a new session.");
            session.setMaxInactiveInterval(30);
        } else{
            out.println("<br>created time = "+session.getCreationTime());
            out.println("<br>last accessed time = "+ session.getLastAccessedTime());
            out.println("<br>maximum inactive interval = "+ session.getMaxInactiveInterval());
        }
        out.println("</BODY></HTML>");
    }
}