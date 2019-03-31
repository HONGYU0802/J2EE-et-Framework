package dao;

public interface IDao<T> {

	public void Insert(T bean);
	public void delete(T bean);
	public void update(T bean,Integer id, String nom, String race, String desc);
	
}
