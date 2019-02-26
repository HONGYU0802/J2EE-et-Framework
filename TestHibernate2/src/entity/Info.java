package entity;

import javax.persistence.Embeddable;

//用来和其他表串联的信息

@Embeddable	//一个实体类要在多个不同的实体类中进行使用，而本身又不需要独立生成一个数据库表，
public class Info {
	private String adress;

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
