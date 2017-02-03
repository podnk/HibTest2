<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	if(session.getAttribute("login") != null)
	{
		session.removeAttribute("login");
		session.removeAttribute("password");
	}
	else
	{
		System.out.print("no session");
	}
%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Good Bye!</title>
</head>
<body>
	<center>
		<h1>Thank You for visiting us!</h1>
		<a href="index.jsp"><font color=red size=7>MAIN PAGE</font></a>
	</center>
</body>
</html>