package in.happycoding.bean;

public class Contact 
{
	private int id;
	private String firstName;
	private String lastName;
	private String number;
	private String emailId;
	
	
	
	public Contact() {
		super();
	}



	public Contact(int id, String firstName, String lastName, String number, String emailId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.emailId = emailId;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	@Override
	public String toString() {
		return "Contact [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", number=" + number
				+ ", emailId=" + emailId + "]";
	}

	
	
}
