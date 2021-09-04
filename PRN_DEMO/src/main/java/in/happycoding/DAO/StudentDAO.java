package in.happycoding.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.happycoding.bean.Student;

public class StudentDAO 
{
	
	final String DATABASE_URL = "jdbc:mysql://localhost:3306/prn_demo";
	final String USER         = "root";
	final String PASSWORD     = "root"; 
	
	public Student getBYPRN(int prn) throws Exception
	{
		Student st = new Student();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			final String string = "SELECT * FROM student WHERE prn = ?";
			Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
			
			PreparedStatement pst = con.prepareStatement(string);
			
			pst.setInt(1, prn);
			
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next())
			{
			
				st.setPrn (rs.getInt("prn"));
				st.setFirstname(rs.getString("firstname"));
				st.setLastname(rs.getString("lastname"));
								
			}	
			
			
			
			con.close();			;
		
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		return st;
				
	}
	
}
