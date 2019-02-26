package entity;

public class CreditCartPayment extends Payment{
	
	private String type;//信用卡种类
	
	public CreditCartPayment() {}
	
	public CreditCartPayment(String description, String type) {
		super(description);
		this.type=type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	
}
