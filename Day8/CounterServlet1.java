package OpenSW.Day8;

@WebServlet ("/CounterServlet1")
public class CounterServlet1 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.printIn("<HTML><BODY>");
    out.printIn("<H1>Counter Servlet 1</H1>");
    ServletContext sc = getServletContext();
    Counter cnt = (Counter)sc.getAttribute("counter");
    if (cnt == nul1) {
        cnt = new Counter();
    ｝
    cnt.addCount();
    out.printin("<p>당신은 "+ cnt.getcount() +"번째 사용자입니다.</p>");
    out.printIn("</BODY></HTML>");
    sc.setAttribute ("counter", cnt);
}
