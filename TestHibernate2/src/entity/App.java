package entity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibern.HibernateUtil;



public class App {
	
	//调用hibernateutile来实现保存数据功能
	//保存课程
	private static void saveCourse(Course cours){
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();//获取当前对话
		try{
			tx = session.beginTransaction();
			session.save(cours);
			tx.commit();
		}catch(HibernateException e){
			tx.rollback();
		}
	}
	
	//保存学生
	private static void saveEtudiant(Etudiant etud){
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try{
			tx = session.beginTransaction();
			session.save(etud);
			tx.commit();
		}catch(HibernateException e){
			tx.rollback();
		}
		
	}
	
	//保存老师
	private static void saveProf(Prof etud){
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try{
			tx = session.beginTransaction();
			session.save(etud);
			tx.commit();
		}catch(HibernateException e){
			tx.rollback();
		}
		
	}
	


	public static void main(String[] args) {
		Info inf =new Info();
		inf.setAdress("Chine");
		
		Course cours1 = new Course();
		cours1.setCourseName("Math");
		saveCourse(cours1);
		
		Prof prof = new Prof();
		prof.setProfName("Mme vial");
		saveProf(prof);
		
		Set<Prof> profs = new HashSet<Prof>();
		profs.add(prof);
		
		Etudiant etudiant = new Etudiant();
		etudiant.setName("hongyu");
		etudiant.setInfoPerso(inf);
		etudiant.setCours(cours1);
		etudiant.setProfs(profs);
		saveEtudiant(etudiant);
		
	}

}
