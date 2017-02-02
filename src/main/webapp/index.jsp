<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
	
<html>
	<title>Домашняя страница</title>
<body>
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
</body>
</html>
