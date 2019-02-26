package springDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Personne;



public class DaoApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Mesbeans.xml");
		
		Personne pers = new Personne();
		pers.setAge("25");
		pers.setNom("hongyu");
		
		DAOPersonne personne = (DAOPersonne) context.getBean("DAOPersonne");
		personne.savePersonne(pers);
		//personne.deletePersonne(pers);
		personne.findById(1);
		
	    

	}

}
