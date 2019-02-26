package springDao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import entity.Personne;

public class DAOPersonneImpl extends HibernateDaoSupport implements DAOPersonne{
	
	//DAO的增，删，查是调用 hibernate的增，删，查方法
	//此处确定操作的数据类型，类类型personne

	@Override
	public void savePersonne(Personne personne) {
		getHibernateTemplate().save(personne);
		
	}

	@Override
	public void deletePersonne(Personne personne) {
		getHibernateTemplate().delete(personne);
		
	}

	@Override
	public Personne findById(int id) {
		return (Personne)getHibernateTemplate().get(Personne.class, id);
	}

	

}
