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
		String login = req.getParameter("loginLog");
		String password = req.getParameter("passwordLog");
		
		HttpSession session = req.getSession(true);
		
		LoginService logService = new LoginService();
		
		boolean result = logService.authenticateAccount(login, password);
		
		Account account = logService.getAccountByLogin(login);
		System.out.println(1);
		if (result == true)
		{
			System.out.println(2);
			req.getSession().setAttribute("account", account);
			System.out.println(3);
			resp.sendRedirect("accountPage.jsp");
			System.out.println(4);
		}
		else 
		{
			resp.encodeRedirectURL("wrong.jsp");
		}
	}
}
