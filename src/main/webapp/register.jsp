<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Регистрация</title>
</head>
<body>
    <h1>Регистрация</h1>
    <form action="register" method="post">
        <table cellpadding="3pt">
            <tr>
                <td>Логин :</td>
                <td><input type="text" name="login" size="30" /></td>
            </tr>
            <tr>
                <td>Пароль :</td>
                <td><input type="password" name="password" size="30" /></td>
            </tr>
            <tr>
                <td>Email :</td>
                <td><input type="text" name="email" size="30" /></td>
            </tr>
            <tr>
                <td>Имя :</td>
                <td><input type="text" name="name" size="30" /></td>
            </tr>
            <tr>
                <td>Фамилия :</td>
                <td><input type="text" name="surname" size="30" /></td>
            </tr>
        </table>
        <p />
        <input type="submit" value="Register" />
    </form>
</body>
</html>