package aisha;


import java.io.Serializable;
import java.util.ArrayList;

public class Courses implements Serializable  {


	private String courName;
	private int courId;

	Marks mark = new Marks();

ArrayList<Marks> markList=new ArrayList<Marks>();


	public ArrayList<Marks> getMarkList() {
	return markList;
}

public void setMarkList(ArrayList<Marks> markList) {
	this.markList = markList;
}

	public String getCourName() {
		return courName;
	}

	public void setCourName(String courName) {
		this.courName = courName;
	}



	public int getCourId() {
		return courId;
	}



	public void setCourId(int courId) {
		this.courId = courId;
	}
}