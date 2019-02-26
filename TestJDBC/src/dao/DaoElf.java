package dao;

import java.util.List;

import ent.Elfe;

public interface DaoElf extends IDao<Elfe>{
	 public Elfe findById(Integer i);
	 public List<Elfe> findAll();
}

