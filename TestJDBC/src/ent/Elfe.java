package ent;


public class Elfe extends Personnage{
	
	private String description;
	
	@Override
	public String getDesc() {
		
		return description;
	}

	@Override
	public void setDesc(String des) {
		description= des;
		//description= getNom()+" "+ getRace()+" "+des;
		
		
	}
	

	
}
