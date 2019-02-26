package hibern;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;//创建会话工厂

    static {
        try {   
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            throw new RuntimeException("Probleme de configuration : " + ex.getMessage(), ex);
        }
    }

    
    public static final ThreadLocal session = new ThreadLocal();//创建本地线程对象

    public static Session currentSession() throws HibernateException {//当前会话方法，返回会话
        Session s = (Session) session.get();
        // Ouvre une nouvelle Session, si ce Thread n'en a aucune
        if (s == null) {
            s = sessionFactory.openSession();
            session.set(s);
        }
        //System.out.println(s.toString());
        return s;
    }

    public static void closeSession() throws HibernateException {//关闭会话
        Session s = (Session) session.get();
        session.set(null);
        if (s != null) {
            s.close();
        }
    }

}
