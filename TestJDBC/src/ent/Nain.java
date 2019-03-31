package ent;

public class Nain extends Personnage{

	private String description;
	@Override
	public String getDesc() {
		
		return description;
	}

	@Override
	public void setDesc(String des) {
		description= des;
		
		
	}

}
