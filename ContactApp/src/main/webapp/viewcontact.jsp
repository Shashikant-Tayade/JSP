<%@page import="in.happycoding.bean.Contact"%>
<%@page import="in.happycoding.DAO.ContactDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
int id = Integer.parseInt(request.getParameter("id"));
ContactDAO contactDAO = new ContactDAO();
Contact c = contactDAO.getById(id);


%>


<h3> Id     :  <%= c.getId()      %>                          </h3> 
<h3> Name   :  <%= c.getFirstName()+ "  "+ c.getLastName() %> </h3> 
<h3> Number :  <%= c.getNumber()  %>                          </h3> 
<h3> E Mail :  <%= c.getEmailId() %>                          </h3> 



</body>
</html>