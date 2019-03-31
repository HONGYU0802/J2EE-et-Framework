package dao;

import java.util.List;

import ent.Nain;

public interface DaoNain extends IDao<Nain>{
	public Nain findById(Integer i);
	public List<Nain> findAll();
}
