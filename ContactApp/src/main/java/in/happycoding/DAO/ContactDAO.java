package in.happycoding.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.happycoding.bean.Contact;

public class ContactDAO 
{
	
	final String DATABASE_URL = "jdbc:mysql://localhost:3306/contacts";
	final String USER         = "root";
	final String PASSWORD     = "root";
	
	
	
	public void Save(Contact c) throws ClassNotFoundException 
	{
		final String Query = "INSERT INTO contact VALUES (?, ?, ?, ?, ?)";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
			PreparedStatement pst = con.prepareStatement(Query);
			pst.setInt(1, c.getId());
			pst.setString(2, c.getFirstName());
			pst.setString(3, c.getLastName());
			pst.setString(4, c.getNumber());
			pst.setString(5, c.getEmailId());
			
			pst.execute();
		    
		    }
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public List<Contact> getAll()
	{
		
		List<Contact> listOfContact = new ArrayList<Contact>();
		
		final String Query = "SELECT * FROM contact";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
			
			PreparedStatement pst = con.prepareStatement(Query);
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) 
			{
				
				Contact contact = new Contact();
				
				contact.setId(rs.getInt("id"));
				contact.setFirstName(rs.getString("firstName"));
				contact.setLastName(rs.getString("LastName"));
				contact.setNumber(rs.getString("number"));
				contact.setEmailId(rs.getString("emailId"));
							
				listOfContact.add(contact);
				
				
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		
		return listOfContact;
		 
	}
	
	
	
	public Contact getById(int id)
	{
		
//	return new Contact(id, "John", "Doe", "1234554321", "John@gmail.com");
		
		final String Query = "SELECT * FROM contact WHERE id = ?";		
		Contact contact = new Contact();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
			
			PreparedStatement pst = con.prepareStatement(Query);
			
			pst.setInt(1, id);
			
			 ResultSet rs = pst.executeQuery();
				
			 
			 while (rs.next())
				{
				
					contact.setId(rs.getInt("id"));
					contact.setFirstName(rs.getString("firstName"));
					contact.setLastName(rs.getString("lastName"));
					contact.setNumber(rs.getString("number"));
					contact.setEmailId(rs.getString("emailId"));
					
				}			 
			 
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		return contact;
				
							
	}
	
	
}
