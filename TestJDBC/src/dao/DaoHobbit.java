package dao;

import java.util.List;

import ent.Hobbit;

public interface DaoHobbit extends IDao<Hobbit>{
	public Hobbit findById(Integer i);
	public List<Hobbit> findAll();
}
