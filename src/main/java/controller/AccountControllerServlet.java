package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.AccountDAO;
 
public class AccountControllerServlet extends HttpServlet 
{
    private static final long serialVersionUID = 1L;
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException 
    {
 
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
 
        @SuppressWarnings("unused")
		HttpSession session = request.getSession(true);
        
        try 
        {
        	AccountDAO accountDAO = new AccountDAO();
        	accountDAO.addAccountDetails(login, password, email, name, surname);
            response.sendRedirect("Success");
        } 
        catch (Exception ex) 
        {
            System.out.println(ex);
        }
    }
}
