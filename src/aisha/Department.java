package aisha;


import java.io.Serializable;
import java.util.ArrayList;

public class Department implements Serializable {

	
	
    private String nameOfDep;
    private Integer depNum; // int vs Integer

    Teacher tech = new Teacher(); // Dont initialize in class

    //ArrayList<Teacher> TeacherList;
    
    ArrayList<Teacher> TeacherList = new ArrayList<>();
    //ArrayList<Teacher> TeacherList;
    
    
    // Dont initialize
   // Scanner sc = new Scanner(System.in); // No need for this


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