package OpenSW.Day8;

@WebServlet("/SelectProduct")
public class SelectProduct extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
response.setContentType ("text/html; charset=UTF-8"); request. setCharacterEncoding("UTF-8");
String username = request.getParameter("username");
HttpSession session = request.getSession();
session.setAttribute("username", username);
PrintWriter out = response.getWriter();
out.printIn("‹center>");

out.printin("<H2>상품 선택</H2>");
out.printin(username +"님이 로그인한 상태입니다");

out.printIn("<form name=form2 method=post action=AddProduct>");
out.printIn("
<select name=product>");
out.printIn("
<option>apple</option>");
out.printIn("
<option>orange</option>");
out .printIn("
<option>lemon</option>");
out.printIn("
</selecty"）；
out.printIn("
‹input type=submit value=‡7 />");
out.printIn("</form>");

out.printIn("<a href=CheckOut>#H</a>");
out.printIn("</center>");
｝
}
