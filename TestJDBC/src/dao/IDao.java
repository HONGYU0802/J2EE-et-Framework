package dao;

public interface IDao<T> {

	public void Insert(T bean);
	public void delete(T bean);
	
}
