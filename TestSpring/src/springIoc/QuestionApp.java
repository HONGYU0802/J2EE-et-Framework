package springIoc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class QuestionApp {

	
	public static void main(String []args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Mesbeans.xml");
		FournisseurQuestion question = (FournisseurQuestion) context.getBean("titi");
		FournisseurQuestion question2 = (FournisseurQuestion) context.getBean("toto");
		question.poseQuestion();
		question2.poseQuestion();
		
		Injection injection=(Injection)context.getBean("Inject");
		System.out.println(injection.getAns());
		injection.MiseAJour("change ans");
		System.out.println(injection.getAns());
		
	}
		
}
