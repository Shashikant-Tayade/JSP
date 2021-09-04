package in.happycoding.Test;

import in.happycoding.DAO.ContactDAO;

public class Test {

	public static void main(String[] args) 
	{
		ContactDAO contactDao = new ContactDAO();
		contactDao.getById(1);
		

	}

}
