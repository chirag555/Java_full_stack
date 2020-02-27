package imageupload.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import imageupload.hibernate.entity.Files;

public class FilesDAO {

	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Files.class)
			.buildSessionFactory();

	public void addFileDetails(Files file) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(file);
		session.getTransaction().commit();
		System.out.println(file.getFileName() + " uploaded");
	}

	public List<Files> listFile() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Files> files = session.createQuery("from files").getResultList();
		// session.getTransaction().commit();
		return files;
	}

	public void updateInformation(int fileId, String caption, String label) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		// session.update(file);
		// this works too--> session.createQuery("update files set
		// caption='"+caption+"',label='"+label+"' where
		// id='"+fileId+"'").executeUpdate();
		Files file = session.get(Files.class, fileId);
		file.setLabel(label);
		file.setCaption(caption);

		session.getTransaction().commit();

	}

	public Files getFile(int fileId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Files file=session.get(Files.class,fileId);
		session.getTransaction().commit();
		return file;
	}

}
