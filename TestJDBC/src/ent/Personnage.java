package ent;

public abstract class Personnage {
	
	private Integer id;
	private String nom;
	private String race;
	private String Arme;//从来没用到过
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getArme() {
		return Arme;
	}
	public void setArme(String arme) {
		Arme = arme;
	}
	
	public abstract String getDesc();
	public abstract void setDesc(String des);
	
}
