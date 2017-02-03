<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	if(session.getAttribute("login") == null || session.getAttribute("password") == null)
	{
		response.sendRedirect("wrong.jsp");
	}
%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Мои сообщения</title>
</head>
<body>
	<center>
		<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js" ></script>
	    <script type="text/javascript" src="https://comet-server.ru/CometServerApi.js" ></script>
	    <script type="text/javascript" src="https://comet-server.ru/doc/html_chat.js" ></script>
	    
	    <link rel="stylesheet" type="text/css" href="https://comet-server.ru/doc/html_chat.css"></link>
	     
	    <div id="html-chat"></div>
	    <style>
		    .holder-html-chat{ border: 1px solid #ccc;padding:10px;background-color: #fff;width: 600px;}
		    .html-chat-history{ max-width: 600px; overflow: auto;max-height: 900px; border: 1px solid #ccc;padding: 5px;}
		    .html-chat-js-name{ margin-top:10px; }
		    .html-chat-js-input{ max-width: 600px;max-height: 100px;width: 600px;margin-top:10px; }
		    .html-chat-js-button-holder{ margin-bottom: 0px;margin-top: 10px; }
		    .html-chat-js-button-holder input{ width: 220px; }
		    .html-chat-js-answer{ float:right; }
		    .html-chat-js-answer a{ color: #777;font-size: 12px; font-family: cursive;}
		    .html-chat-js-answer a:hover{ color: #338;font-size: 12px; font-family: cursive;}
		    .html-chat-msg{ margin: 0px; }
	    </style>
	     
	    <script>
	        $(document).ready(function()
	        {
	           CometServer().start({dev_id: 15 })
	           htmljs_Chat_Init( $("#html-chat") )
	        });
	    </script>
	</center>
</body>
</html>