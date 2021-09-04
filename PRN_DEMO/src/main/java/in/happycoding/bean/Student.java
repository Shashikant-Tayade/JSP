package in.happycoding.bean;

public class Student 
{
	private int prn;
	private String firstname;
	private String lastname;
	
	
	public Student()
	{
		super();
	}


	public Student(int prn, String firstname, String lastname)
	{
		super();
		this.prn = prn;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	
	
	

	public int getPrn() {
		return prn;
	}


	public void setPrn(int prn) {
		this.prn = prn;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Override
	public String toString() 
	{
		return "Student [prn=" + prn + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
		
	
}
