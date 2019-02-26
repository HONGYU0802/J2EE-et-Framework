package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//教师表
@Entity
public class Prof {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name ="PROF_NAME")
	private String profName;

	public String getProfName() {
		return profName;
	}

	public void setProfName(String profName) {
		this.profName = profName;
	}

}
