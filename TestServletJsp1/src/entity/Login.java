package entity;

//创建登陆对象
public class Login {
	//私有
	private String nom;
	private String pass;
	//双参构造方法
	public Login(String nom, String pass) {
		this.nom =nom;
		this.pass=pass;
	}
	//封装
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	//判断属性值
	public boolean isValide() {
		if(nom.equals("Titi")) {
			return true;
		}
		return false;
	}
	
}
