<%@page import="org.eurokids.doa.DataAccess"%>
<%@page import="org.eurokids.model.Admin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String username=request.getParameter("username");
	String emailId=request.getParameter("emailId");
	String password=request.getParameter("password");
	String status=request.getParameter("status");
	int stat=Integer.parseInt(status);
	
	
	Admin ad = new Admin(username,emailId,password,stat);
	DataAccess doa=new DataAccess();
	doa.insertAdmin(ad);
	response.sendRedirect("../view/adminmanager.jsp");
	
%>
</body>
</html>