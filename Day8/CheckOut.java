package OpenSW.Day8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/CheckOut")
public class CheckOut extends HttpServlet {
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String name = (String)session.getAttribute("username");
        ArrayList<?› list = (Arraylist<?>)session.getAttribute("productlist"); 
        out.printIn("‹html>‹body>");
        out.printin("<center><H2>"+ name+"님이 선택한 상품 목록 </H22");
        if (list == null) {
            out.printin("선택한 상품이 없습니다!");
        } else {
            for (Object product:list) {
                out.printIn(product + "‹br>");
        }
        out.println("‹/center>");
    ｝
    out.printIn("</body></html>");
    }
}
