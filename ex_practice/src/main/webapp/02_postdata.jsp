<%@page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<html>
<head>
     <title>POST ��� ��û</title>
</head>
<body>
<!-- JSP ���� �ۼ� -->
	<%
	String strName=request.getParameter("name");
	String strMajor=request.getParameter("major");
	out.println("�̸� :" + strName + "<br/>");
	out.println("�а� :" + strMajor + "<hr/>");
	%>
	�� ������ URL �ּ� �Է� �κ��� ���캸����.
</body>
</html>