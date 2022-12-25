package aisha;

import java.util.ArrayList;

import java.util.Scanner;

public class School {
	School(String name){
		System.out.println(name);
	}

	private String nameOfSchool;
	private String location;
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
