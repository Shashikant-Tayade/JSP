package in.jappycoding.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.happycoding.DAO.ContactDAO;
import in.happycoding.bean.Contact;


public class SaveContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String id = request.getParameter("id");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String number = request.getParameter("number");
		String emailId = request.getParameter("emailId");
		
		Contact theContact = new Contact(Integer.parseInt(id), firstName, lastName, number, emailId);
		ContactDAO contactDAO = new ContactDAO();
		try 
		{
			contactDAO.Save(theContact);
		} catch (ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		
		response.sendRedirect("index.jsp");
				
	}

	

}
