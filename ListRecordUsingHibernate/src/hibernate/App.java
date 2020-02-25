package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hibernate.entity.Users;

public class App {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			//Create class entity object
			Users user=new Users();
			//Start Transaction
			session.beginTransaction();
			//Perform operation
			user=session.get(Users.class,2);
			//Deleting a record with user id 2
			session.delete(user);
			//commit the transaction
			
			session.getTransaction().commit();
			System.out.println(user);
			
				
		} finally {
			session.close();
			factory.close();
		}

	}

}
