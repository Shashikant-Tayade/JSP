<%@page import="in.happycoding.bean.Contact"%>
<%@page import="java.util.List"%>
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

<h1> My Contacts </h1>
<a href="add_new_contact.jsp"> <input type="button" value="Add New Contact"> </a> <br><br>
<hr>

<%

ContactDAO contactDAO = new ContactDAO();
List<Contact> listOfContacts = contactDAO.getAll(); 
out.print("<ul>");

for(Contact c : listOfContacts)
{
	out.print("<li>"+ c.getFirstName()+ " "+c.getLastName());
	out.print(" <a href = 'viewcontact.jsp?id="+c.getId()+" '> View </a>");
	out.print("<br>");
	out.print(c.getNumber());
	out.print("</li>");
	out.print("<hr>");
}
out.print("</ul>");


%>


</body>
</html>