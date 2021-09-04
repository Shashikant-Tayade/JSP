<%@page import="in.happycoding.DAO.StudentDAO"%>
<%@page import="in.happycoding.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="header.html" %>

<%

int prn = Integer.parseInt(request.getParameter("prn"));

StudentDAO sd = new StudentDAO();
Student s = sd.getBYPRN(prn);

%>

<h3> PRN : <%= s.getPrn() %></h3>
<h3> FirstName : <%= s.getFirstname() %></h3>
<h3> LastName : <%= s.getLastname() %></h3>



</body>
</html>