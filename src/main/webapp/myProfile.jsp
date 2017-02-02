<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<%
		String name;
		String surname;
		String email;
		String login = (String)session.getAttribute("login");
		String password = (String)session.getAttribute("login");
		
	%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Мой Профиль</title>
</head>
<body>
Имя:<br>
Фамилия:<br>
Email:<br>
Логин: <font color="green"><%= login %></font><br> 
Пароль (для демонстрации): <font color="RED"><%= password %></font><br> 
</body>
</html>