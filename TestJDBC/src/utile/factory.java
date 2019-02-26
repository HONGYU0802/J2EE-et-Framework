package utile;

import java.util.HashMap;
import java.util.Map;

import ent.Personnage;


public class factory {
	
	static factory instance=null;
	
	private Map<String, String> maMap= new HashMap<String, String>();
	
	private factory() {
		maMap.put("elfe", "ent.Elfe");
		maMap.put("nain", "ent.Nain");
		maMap.put("hobbit", "ent.Hobbit");
	}
	
	public static factory getInstance() {
		if (instance ==null)
			instance=new factory();
		return instance;
	}
	
	public Personnage getClasse(String race) {
		Personnage p =null;
		
		try {
			
		String nomDeMaClasse =maMap.get(race);
		Class maClasse=Class.forName(nomDeMaClasse);
		p = (Personnage) maClasse.newInstance();
		
		}
		catch (Exception e) {
			
		}
		return p;
	}
	
	public static void main(String[] args) {
		factory f= factory.getInstance();
		System.out.println(f);
		
		Personnage p = f.getClasse("elfe");
		System.out.println(p);
		
	}
	
}
