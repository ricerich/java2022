<%@ page import="java.sql.*"%> 
<%
	Connection conn = null;

	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "webmarketDB";
	String password = "web1234";

	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn = DriverManager.getConnection(url, user, password);
%>