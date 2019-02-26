package ent;

public class Hobbit extends Personnage{

	private String description;
	@Override
	public String getDesc() {
		
		return description;
	}

	@Override
	public void setDesc(String des) {
		description= getNom()+" "+ getRace()+" "+des;
		
		
	}

}
