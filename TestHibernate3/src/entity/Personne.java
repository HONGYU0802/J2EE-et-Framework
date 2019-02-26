package entity;

public class Personne {
	
	private Long P_Id;
	private String nom;
	private String prenom;
	
	
	public Personne(){}
	
	public Long getP_Id() {
		return P_Id;
	}

	public void setP_Id(Long p_Id) {
		P_Id = p_Id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	public String toString(){
		
		return "id:"+ getP_Id()+"Nom"+getNom()+"prenom"+getPrenom();
		
	}


}
