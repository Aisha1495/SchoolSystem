package aisha;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Teacher implements Serializable{

	private String teachName;
	private Integer teachId;

	Student stud = new Student();
	
	ArrayList<Student> StudList=new ArrayList<Student>();

	//ArrayList<Student> StudList;
	
	public ArrayList<Student> getStudList() {
		return StudList;
	}

	public void setStudList(ArrayList<Student> studList) {
		StudList = studList;
	}

	public int getTeachId() {
		return teachId;
	}

	public void setTeachId(int teachId) {
		this.teachId = teachId;
	}

	public String getTeachName() {
		return teachName;
	}

	public void setTeachName(String teachName) {
		this.teachName = teachName;
	}

}