package sviat.inf.ua.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class testJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false";
		String user = "root";
		String pass = "";
		
		
		try {
			System.out.println("Connection to DB:" + url);
			
			Connection myConn = DriverManager.getConnection(url, user, pass);
			
			System.out.println("Connection successsful!!!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
