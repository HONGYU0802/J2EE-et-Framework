package hiber;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

//干啥用的不知道
public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
	
	
	static {
		try {
			sessionFactory = new AnnotationConfiguration().configure()
					.buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	
}
