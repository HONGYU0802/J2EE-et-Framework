package service;

import entity.Personne;
import springDao.DAOPersonne;

public class ServicePersonneImpl implements IServicePersonne {
	
	private DAOPersonne idaoPersonne;//为什么要实现一个DAO类型的变量？？？
									 //因为此处调用的是DAOIMPL的增，删，查
	
	//此业务逻辑层的增，删，查，等同于DAO里的增，删，查
	@Override
	public void savePersonne(Personne personne) {	
		idaoPersonne.savePersonne(personne);		
	}

	@Override
	public void deletePersonne(Personne personne) {		
		idaoPersonne.deletePersonne(personne);		
	}

	@Override
	public Personne findById(int id) {		
		return idaoPersonne.findById(id);
	}

}
