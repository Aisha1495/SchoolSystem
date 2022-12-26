package aisha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ExecutionClass {

	public static void main(String[] arg) {

		School sch = new School("Muscat School" , "Bushar");
//		Department dep = new Department();
//		Teacher teach = new Teacher();
//		Student stud = new Student();
//		Marks mark = new Marks();
//		Courses cours = new Courses();
		List<Department> departmentList = new ArrayList<>();
		boolean addDepartment = true;
	
		
		Scanner sc = new Scanner(System.in);
		
		
//		System.out.println("Enter School Name:  ");
//		String schoolName = sc.next();
//		sch.setNameOfSchool(schoolName);

		while (addDepartment) {

			Department dep = new Department();

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

			boolean addStudent = true;
			while (addStudent) {
				Student stud = new Student();

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

				} else if (answer2.equals("no")) {
					addStudent = false;
					System.out.println("Course:");
					break;

				}

			}

			boolean addCourse = true;
			while (addCourse) {
				Courses cour = new Courses();

				System.out.println("Enter Course Name:  ");
				String courName = sc.next();
				cour.setCourName(courName);

				System.out.println("Enter Course id:  ");
				int courId = sc.nextInt();
				cour.setCourId(courId);

				System.out.println("Do you want to Enter Other Course? (yes/no):  ");
				String answer3 = sc.next();
				dep.tech.stud.CoursList.add(cour);
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
				dep.tech.stud.cour.markList.add(mark);
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
				addDepartment = false;

				// break;
				System.out.println("Thanks");
				System.out.println("**************************");
				System.out.println();
				
				System.out.println(sch); // check no print
				System.out.println();
				//    System.out.println("School Name:" + sch.getNameOfSchool());
			

				for (Department dep1 : departmentList) {
					System.out.println("___________________________");
					System.out.println();
					System.out.println("Department Name:" + dep1.getNameOfDep());
					System.out.println("Department id:" + dep1.getDepNum());
					System.out.println();
					System.out.println("___________________________");
					System.out.println();

					for (Teacher tech1 : dep1.TeacherList) {
						System.out.println("Teacher Name: " + tech1.getTeachName());
						System.out.println("Teacher id: " + tech1.getTeachId());
						System.out.println();

						for (Student stud1 : dep1.tech.StudList) {
							System.out.println("Student Name: " + stud1.getStudName());
							System.out.println("Student id: " + stud1.getStudId());
							System.out.println();

							for (Courses cour1 : dep1.tech.stud.CoursList) {
								System.out.println("Course Name: " + cour1.getCourName());
								System.out.println("Course id: " + cour1.getCourId());
								System.out.println();

								for (Marks mark1 : dep1.tech.stud.cour.markList) {
									System.out.println("The Grade : " + mark1.grade);
									System.out.println();
								
								}
							}

						}
					}

				}
			}
		}
	}
}
