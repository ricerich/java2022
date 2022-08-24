<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
<title>Session</title>
</head>
<body>
	<%
		String sessin_id = session.getId();

		long last_time = session.getLastAccessedTime();
		long start_time = session.getCreationTime();
		
		//Date d1 = new Date();
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		
		

		long used_time = (last_time - start_time) / 60000;

		out.println("세션 아이디 : " + sessin_id + "<br>");
		out.println("요청 시작 시간  : " + start_time + "<br>");
		out.println("요청 마지막 시간  : " + last_time + "<br>");
		out.println("웹 사이트에서 경과 시간  : " + used_time + "분<br><br>");
		
		out.println("요청 시작 시간  : " + f1.format(start_time) + "<br>");
		out.println("요청 마지막 시간  : " + f1.format(last_time) + "<br>");
	%>
</body>
</html>