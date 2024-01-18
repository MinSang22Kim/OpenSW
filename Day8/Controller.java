package OpenSW.Day8;

public class Controller {
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        request.setAttribute("username", username);
        RequestDispatcher view = request.getRequestDispatcher("/View");
        view. forward (request, response);
    }
}
