package entity;

public class Payment {
	
	private int paymentId;
	private String description;
	
	
	public Payment() {}//无参构造函数
	
	public Payment (String description) {//单参构造函数
		this.description=description;
	}
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
