package OpenSW.Day8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        HttpSession session = request.getSession();
        ArrayList‹String> list = (Arraylist‹String>)session.getAttribute("productlist");
        if (list == null)
        list = new ArrayList‹String>();
        list. add (product);
        session.setAttribute("productlist", list);
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.printIn("<html><body>");
        out.printIn(product + "0(7) #79844."); out.printIn("</body></html>");
    }
}
