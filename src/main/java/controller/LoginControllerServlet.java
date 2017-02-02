package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Account;
import services.LoginService;

public class LoginControllerServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
    	
		String login = req.getParameter("loginLog");
		String password = req.getParameter("passwordLog");
		
		HttpSession session = req.getSession(true);
		
		session.setAttribute("login", login);
		session.setAttribute("password", password);
		
		LoginService logService = new LoginService();
		
		boolean result = logService.authenticateAccount(login, password);
		
		Account account = logService.getAccountByLogin(login);
		if (result == true)
		{
			req.getSession().setAttribute("account", account);
			resp.sendRedirect("accountPage.jsp");
		}
		else 
		{
			resp.encodeRedirectURL("wrong.jsp");
		}
	}
}
