package dao;


import ent.Hobbit;

public interface DaoHobbit extends IDao<Hobbit>{
	public Hobbit findById(Hobbit h);

}
