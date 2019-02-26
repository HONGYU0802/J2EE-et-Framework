package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//学生表
@Entity		//映射实体类
@Table(name ="ETUDIANT")	//映射数句库表
public class Etudiant {
	
	//一个学生最基础的信息，ID和姓名
	@Id
	@GeneratedValue
	private long etudiantId;

	@Column (name = "ETUDANT_NAME",nullable = false,length = 100)
	private String name;
	
	public long getEtudiantId() {
		return etudiantId;
	}

	public void setEtudiantId(long etudiantId) {
		this.etudiantId = etudiantId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	
	//学生表包含的个人信息对象
	//个人信息不创建表，创建一个信息类型的对象
	private Info infoPerso;
	
	public Info getInfoPerso()  {
		return infoPerso;
	}

	public void setInfoPerso(Info infoPerso) {
		this.infoPerso = infoPerso;
	}
	
	//学生包含的课程对象，多对一，多个学生上一门课
	//课程类的对象
	@ManyToOne(cascade = CascadeType.ALL)	//设置级联方式
	private Course cours;
	
	public Course getCours() {
		return cours;
	}

	public void setCours(Course cours) {
		this.cours = cours;
	}

	
	//老师集合，多对多，一个学生有好几个老师，一个老师也有好几个学生
	@ManyToMany
	private Set<Prof> profs = new HashSet<Prof>(0);
	
	public Set<Prof> getProfs() {
		return profs;
	}

	public void setProfs(Set<Prof> profs) {
		this.profs = profs;
	}

	

}
