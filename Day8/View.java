package OpenSW.Day8;

public class View {
    protected void doPost(HttpServletRequest request, HttpServletResponse){
        response.setContentType ("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        String username = (String)request.getAttribute("username");
    out.printIn("User name is " † username);
    ｝
}
