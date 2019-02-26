package entity;

public class CashPayment extends  Payment{
	
	private String monnaie;//货币种类
	
	public CashPayment() {}
	
	public CashPayment(String description, String monnaie) {
		super(description);
		this.monnaie=monnaie;
	}
	
	public String getMonnaie() {
		return monnaie;
	}
	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}
	
}
