package entity;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibern.HibernateUtil;


public class App {
	
	//保存支付
	private static void sauve(Payment p){
		Transaction tx=null;
		Session session = HibernateUtil.currentSession();
		try{				
			tx = session.beginTransaction();
			session.save(p);
			tx.commit();
			
		}catch (HibernateException e){
			tx.rollback();
		}
	}
	
	
	//保存现金支付
	private static void sauve(CashPayment p){
		Transaction tx=null;
		Session session = HibernateUtil.currentSession();
		try{				
			tx = session.beginTransaction();
			session.save(p);
			tx.commit();
			
		}catch (HibernateException e){
			tx.rollback();
		}
	}	
	
	
	//保存信用卡支付
	private static void sauve(CreditCartPayment p){
		Transaction tx=null;
		Session session = HibernateUtil.currentSession();
		try{				
			tx = session.beginTransaction();
			session.save(p);
			tx.commit();
			
		}catch (HibernateException e){
			tx.rollback();
		}
	}
		
	
	public static void main(String[] args) {
		
		CreditCartPayment cc= new CreditCartPayment("cart","visa");
		sauve(cc);
		
		CashPayment cp= new CashPayment("cash","euros");
		sauve(cp);
		
		Payment p= new Payment();
		//Payment p= new Payment("none");
		
		sauve(p);
	}	
	

}
