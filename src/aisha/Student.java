package aisha;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student implements Serializable {

	private String studName;
	private int studId;
	Courses cours = new Courses();
	
	ArrayList<Courses> CoursList=new ArrayList<Courses>();
	
	
	public ArrayList<Courses> getCoursList() {
		return CoursList;
	}

	public void setCoursList(ArrayList<Courses> coursList) {
		CoursList = coursList;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}


	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}
}