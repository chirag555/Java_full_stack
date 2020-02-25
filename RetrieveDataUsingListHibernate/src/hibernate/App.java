package hibernate;

import java.util.List;

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
			
			session.beginTransaction();
			//Perform operation
			//List<Users> user=session.createQuery("from users where firstName='jainik'" + "or lastName='jatin'").getResultList();
			List<Users> user=session.createQuery("from users where firstName='jainik'" + "or lastName like '%in'").getResultList();

			for(Users temp:user) {
				System.out.println(temp);
			}
			//commit the transaction
			//session.getTransaction().commit();
			
			
				
		} finally {
			session.close();
			factory.close();
		}

	}

}
