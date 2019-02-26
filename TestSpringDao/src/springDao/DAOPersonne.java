package springDao;

import entity.Personne;

public interface DAOPersonne {
	//增，删，查
	public void savePersonne(Personne personne);
	public void deletePersonne(Personne personne);
	public Personne findById(int id);

}
