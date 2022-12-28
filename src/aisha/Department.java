package aisha;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Department implements Serializable {

	private String nameOfDep;
	private int depNum;

	Teacher tech = new Teacher();
	
	ArrayList<Teacher> TeacherList =new ArrayList<>();
	Scanner sc = new Scanner(System.in);



		public ArrayList<Teacher> getTeacherList() {
		return TeacherList;
	}

	public void setTeacherList(ArrayList<Teacher> teacherList) {
		TeacherList = teacherList;
	}

	
	public int getDepNum() {
		return depNum;
	}

	public void setDepNum(int depNum) {
		this.depNum = depNum;
	}

	public String getNameOfDep() {
		return nameOfDep;
	}

	public void setNameOfDep(String nameOfDep) {
		this.nameOfDep = nameOfDep;
	}

}
