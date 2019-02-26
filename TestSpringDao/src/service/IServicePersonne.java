package service;

import entity.Personne;

public interface IServicePersonne {
	
	public void savePersonne(Personne personne);
	public void deletePersonne(Personne personne);
	public Personne findById(int id);


}
