<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	
<html>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Главная страница</title>
</head>
<body>
	<center>
	<h1>Добро пожаловать!</h1>
    <form action="selectPage" method="post">
        <table>
            <tr>
                <td>Логин :</td>
                <td><input type="text" name="loginLog" size="30" /></td>
            </tr>
            <tr>
                <td>Пароль :</td>
                <td><input type="password" name="passwordLog" size="30" /></td>
            </tr>
        </table>
        <p />
        <input type="submit" 	name="enter" 	value="Войти"/>
		<input type="submit" 	name="register" value="Регистрация"/> <Br>
    </form>
	</center>
</body>
</html>
