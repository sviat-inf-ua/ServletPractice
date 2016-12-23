package sviat.inf.ua.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sviat.inf.ua.hibernate.demo.entity.Test;

public class CreateStudentDemo {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Test.class)
				.buildSessionFactory();
		
		
		//create factory
		Session session = factory.getCurrentSession();
		
		try {
			// create student object
			System.out.println("create new Test Obj...");
			
			Test tempTest = new Test("Elton", "John@gmail.com");
			Test test1 = new Test("Erick", "Smith");
			
			//start session 
			session.beginTransaction();
			
			//save the TestObj
			session.save(tempTest);
			System.out.println("Saving the Test...");
			
			//Commit transaction
			session.getTransaction().commit();
			
			System.out.println("Well done!!!");
			
			
			
		} finally {
			factory.close();
		}
		
		
	}

}
