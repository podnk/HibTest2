package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServlet extends HttpServlet
{
	private static final long serialVersionUID = 7396539970228569232L;
	
	public void forward(String forwardTo, 
			HttpServletRequest req, HttpServletResponse resp)
	{
		RequestDispatcher requestDispatcher = getServletContext().
				getRequestDispatcher(forwardTo);
		
		try
		{
			requestDispatcher.forward(req, resp);
		}
		catch (ServletException e){}
		catch (IOException e){}
	}
}
