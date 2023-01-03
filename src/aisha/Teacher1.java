package aisha;

import java.io.Serializable;

public class Teacher1 implements Serializable{
	
	String techName;
	Integer techId;
	public Teacher1(String techName, int techId) {
	this.techName= techName;
	this.techId=techId;
	
	
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	public Integer getTechId() {
		return techId;
	}
	public void setTechId(Integer techId) {
		this.techId = techId;
	}
}
