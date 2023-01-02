package aisha;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ExecutionClass  {

	public static void main(String[] arg) throws IOException, ClassNotFoundException {
		
		

		Stack<String> stk = new Stack<String>();

		School sch = new School("Muscat School", "Bushar");
//		Department dep = new Department();
//		Teacher tech = new Teacher();
//		Student stud = new Student();
//		Marks mark = new Marks();
//		Courses cours = new Courses();

		List<Department> departmentList = new ArrayList<>();
		boolean addDepartment = true;

		Scanner sc = new Scanner(System.in);
		
		
//		System.out.println("Enter School Name:  ");
//		String schoolName = sc.next();
//		sch.setNameOfSchool(schoolName);


	
		
		
	FileWriter myWriter = new FileWriter("C:\\Users\\Lenovo\\eclipse-workspace\\aisha\\FileExample.txt");
	
	while(addDepartment){

		 Department dep = new Department();
		 
		 
		 // save obj into file 
	
		System.out.println("Enter Department Name:  ");
		String depName = sc.next();
		dep.setNameOfDep(depName);

		System.out.println("Enter Department id:  ");
		int depId = sc.nextInt();
		dep.setDepNum(depId);

		boolean addTeacher = true;
		while (addTeacher) {

			 Teacher tech = new Teacher();

			System.out.println("Enter Teacher Name:  ");
			String techName = sc.next();
			tech.setTeachName(techName);

			// stk.push(techName);

			System.out.println("Enter Teacher id:  ");
			int techId = sc.nextInt();
			tech.setTeachId(techId);

			System.out.println("Do you want to Enter Other Teacher? (yes/no):  ");
			String answer1 = sc.next();
			dep.TeacherList.add(tech);
			if (answer1.equals("yes")) {
				System.out.println("Next Teacher:");
				addTeacher = true;

			} else if (answer1.equals("no")) {
				addTeacher = false;
				System.out.println("Student:");
				break;

			}
		}
		 FileOutputStream f = new FileOutputStream(
					new File("C:\\Users\\Lenovo\\eclipse-workspace\\aisha\\objExample.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

		boolean addStudent = true;
		while (addStudent) {
			 Student stud = new Student();
			
			 
//
//				FileInputStream fi = new FileInputStream(
//						new File("C:\\Users\\Lenovo\\eclipse-workspace\\aisha\\objExample.txt"));
//				ObjectInputStream oi = new ObjectInputStream(fi);
//
//				// Read objects
//				Student pr1 = (Student) oi.readObject();
//				pr1.setStudName("Aisha");
//				System.out.println(pr1.getStudName());
//
//				oi.close();
//				fi.close();
//				

			System.out.println("Enter Student Name:  ");
			String studName = sc.next();
			stud.setStudName(studName);

			System.out.println("Enter Student id:  ");
			int studId = sc.nextInt();
			stud.setStudId(studId);
			
			
			

			System.out.println("Do you want to Enter Other Student? (yes/no):  ");
			String answer2 = sc.next();
			dep.tech.StudList.add(stud);
			if (answer2.equals("yes")) {
				System.out.println("Next Student:");
				addStudent = true;
				
				// Write objects to file
				o.writeObject(stud);

			} else if (answer2.equals("no")) {
				addStudent = false;
				System.out.println("Course:");
				break;
				
				

			}
	
		}

		o.close();
		f.close();
		

		boolean addCourse = true;
		while (addCourse) {
			 Courses cours = new Courses();

			System.out.println("Enter Course Name:  ");
			String courName = sc.next();
			cours.setCourName(courName);

			stk.push(courName); // stack

			System.out.println("Enter Course id:  ");
			int courId = sc.nextInt();
			cours.setCourId(courId);

			System.out.println("Do you want to Enter Other Course? (yes/no):  ");
			String answer3 = sc.next();
			dep.tech.stud.CoursList.add(cours);
			if (answer3.equals("yes")) {
				System.out.println("Next Course:");
				addCourse = true;

			} else if (answer3.equals("no")) {
				addCourse = false;
				System.out.println("Supject with Mark:");
				break;

			}

		}
		boolean addMark = true;
		while (addMark) {
			 Marks mark = new Marks();

			System.out.println("Enter three supject:  ");

			String subN_1 = sc.next();
			String subN_2 = sc.next();
			String subN_3 = sc.next();
			System.out.println(subN_1);
			System.out.println(subN_2);
			System.out.println(subN_3);

			System.out.println("Enter Three Marks of Each Mark");
			mark.markAvrg();

			System.out.println("Do you want to add new Mark? yes/no");
			String answer4 = sc.next();
			dep.tech.stud.cours.markList.add(mark);
			if (answer4.equals("yes")) {
				System.out.println("Next Student Mark:");
				addMark = true;

			} else if (answer4.equals("no")) {
				addMark = false;
				System.out.println("end:");
				break;

			}

		}

		departmentList.add(dep);

		System.out.println("Do you want to add new department? yes/no");
		String answer10 = sc.next();
		if (answer10.equals("yes")) {
			addDepartment = true;
			System.out.println("Next Department");
		} else if (answer10.equals("no")) {
			addDepartment = false;//''''''''

			
		
			
			
			
			// break;

			System.out.println("Thanks");

			System.out.println("**************************");

			System.out.println();

			System.out.println(sch.getNameOfSchool());
			System.out.println(sch.getLocation());
			System.out.println();

			// System.out.println("School Name:" + sch.getNameOfSchool());

			for (Department dep1 : departmentList) {
				System.out.println("____________________________________________________" + "\n");
				myWriter.write("____________________________________________________" + "\n");
				System.out.println();
				myWriter.write("\n");
				System.out.println("Department Name:" + dep1.getNameOfDep());
				myWriter.write("Department Name : " + dep1.getNameOfDep() + "\n");
				System.out.println("Department id:" + dep1.getDepNum());
				myWriter.write("Department id: " + dep1.getDepNum() + "\n" + "\n");
				System.out.println();
				myWriter.write("\n");
				System.out.println("____________________________________________________");
				myWriter.write("____________________________________________________");
				System.out.println();
				myWriter.write("\n");

				for (Teacher tech1 : dep1.TeacherList) {

					System.out.println("Teacher Name: " + tech1.getTeachName());
					myWriter.write("Teacher Name: " + tech1.getTeachName() + "\n");
					System.out.println("Teacher id: " + tech1.getTeachId());
					myWriter.write("Teacher id: " + tech1.getTeachId() + "\n");
					System.out.println();
					myWriter.write("\n");

					for (Student stud1 : dep1.tech.StudList) {
						System.out.println("Student Name: " + stud1.getStudName());
						myWriter.write("Student Name: " + stud1.getStudName() + "\n");
						System.out.println("Student id: " + stud1.getStudId());
						myWriter.write("Student id: " + stud1.getStudId() + "\n");
						System.out.println();
						myWriter.write("\n");

						for (Courses cour1 : dep1.tech.stud.CoursList) {
							System.out.println("Course Name: " + cour1.getCourName());
							myWriter.write("Course Name: " + cour1.getCourName() + "\n");
							System.out.println("Course id: " + cour1.getCourId());
							myWriter.write("Course id: " + cour1.getCourId() + "\n");
							System.out.println();
							myWriter.write("\n");

							for (Marks mark1 : dep1.tech.stud.cours.markList) {
								System.out.println("The Grade : " + mark1.grade);
								myWriter.write("The Grade is  : " + mark1.grade + "\n");
								System.out.println();
								myWriter.write("\n");

							}
							
						}

					}

				}
			}

		}

	}
	
	
		System.out.println("Do you want to check the history of Course (yes/no) ");
		String answer11 = sc.next();
		if (answer11.equals("yes")) {
			for (int ii = 0; ii <= stk.size(); ii++) {
				System.out.println(stk.pop());
			}

		} else {

			System.out.println("No History , Thank you have a nice day");
		}
		myWriter.close();
	}
	

}