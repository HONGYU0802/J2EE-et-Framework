package entity;

import hibern.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class App {

	private static void save(Personne personne){
		Transaction tx=null;
		Session session = HibernateUtil.currentSession();
		try{
				tx = session.beginTransaction();
				session.save(personne);
				
				tx.commit();
		}catch (HibernateException e){
			tx.rollback();
		}
	}
	
	
	public static void main(String[] args){
		Personne premier = new Personne();
		premier.setNom("li");
		premier.setPrenom("hongyu");
		save(premier);
		
		Personne deuxieme = new Personne();
		deuxieme.setNom("wang");
		deuxieme.setPrenom("ying");
		save(deuxieme);	
		
	}
	

	
}
