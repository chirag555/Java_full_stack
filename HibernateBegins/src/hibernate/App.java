package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Users;

public class App {
	public static void main(String[] args) {
 
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			Users user=new Users("admin","admin","chirag","kaushik");
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			System.out.println("Row Added!!");
			
		}
		finally {
			session.close();
			factory.close();
		}
		
	}
}
