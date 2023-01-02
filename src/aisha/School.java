package aisha;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.Scanner;

public class School  implements Serializable {
	

	private String nameOfSchool;
	private String location;
	
//	School(String name , String Location){
//		System.out.println(name);
//		System.out.println(Location);
//		this.nameOfSchool=name;
//		this.location=Location;
//		
	    public School(String nameOfSchool, String location) {
	    	
	        this.nameOfSchool = nameOfSchool;
	        this.location = location;
	}
	

	int schoolId;

	ArrayList<Department> departmentName = new ArrayList<Department>();
	ArrayList<Department> departmentId = new ArrayList<Department>();
	
	public ArrayList<Department> getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(ArrayList<Department> departmentName) {
		this.departmentName = departmentName;
	}

	public ArrayList<Department> getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(ArrayList<Department> departmentId) {
		this.departmentId = departmentId;
	}

	Scanner sc = new Scanner(System.in);

	{

	}

	
	public String getNameOfSchool() {
		return nameOfSchool;
	}

	public void setNameOfSchool(String nameOfSchool) {
		this.nameOfSchool = nameOfSchool;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}