package aisha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ExecutionClass {

	public static void main(String[] arg) {

		School sch = new School();
//		Department dep = new Department();
//		Teacher teach = new Teacher();
//		Student stud = new Student();
//		Marks mark = new Marks();
//		Courses cours = new Courses();
		List<Department> departmentList = new ArrayList<>();
		int depListIndex=0;
		boolean addDepartment = true;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter School Name:  ");
		String schoolName = sc.next();
		sch.setNameOfSchool(schoolName);

		while (addDepartment) {

			Department dep = new Department();
			departmentList.add(dep);
			System.out.println("Enter Department Name:  ");
			String depName = sc.next();
			departmentList.get(depListIndex).setNameOfDep(depName);
			//dep.setNameOfDep(depName);
			
			

			System.out.println("Enter Department id:  ");
			int depId = sc.nextInt();
			departmentList.get(depListIndex).setDepNum(depId);
			//dep.setDepNum(depId);

			int techListIndex = 0;
			boolean addTeacher = true;
			while (addTeacher) {

				Teacher tech = new Teacher();
				departmentList.get(depListIndex).TeacherList.add(tech);
				System.out.println("Enter Teacher Name:  ");
				String techName = sc.next();
				departmentList.get(depListIndex).TeacherList.get(techListIndex).setTeachName(techName);
				//tech.setTeachName(techName);

				System.out.println("Enter Teacher id:  ");
				int techId = sc.nextInt();
				departmentList.get(depListIndex).TeacherList.get(techListIndex).setTeachId(techId);
				//tech.setTeachId(techId);

				System.out.println("Do you want to Enter Other Teacher? (yes/no):  ");
				String answer1 = sc.next();
				dep.TeacherList.add(tech);
				if (answer1.equals("yes")) {
					System.out.println("Next Teacher:");
					addTeacher = true;
					techListIndex++;
					
				

				} else if (answer1.equals("no")) {
					addTeacher = false;
					System.out.println("Student:");
					break;

			}
			}
			

			int studListIndex = 0;
			boolean addStudent = true;
			while (addStudent) {
				Student stud = new Student();
				departmentList.get(depListIndex).TeacherList.get(techListIndex).StudList.add(stud);

				System.out.println("Enter Student Name:  ");
				String studName = sc.next();
				departmentList.get(depListIndex).TeacherList.get(techListIndex).StudList.get(studListIndex).setStudName(studName);
				//stud.setStudName(studName);

				System.out.println("Enter Student id:  ");
				int studId = sc.nextInt();
				departmentList.get(depListIndex).TeacherList.get(techListIndex).StudList.get(studListIndex).setStudId(studId);
				//stud.setStudId(studId);

				System.out.println("Do you want to Enter Other Student? (yes/no):  ");
				String answer2 = sc.next();
				dep.tech.StudList.add(stud);
				if (answer2.equals("yes")) {
					System.out.println("Next Student:");
					addStudent = true;
					
					studListIndex++;

				} else if (answer2.equals("no")) {
					addStudent = false;
					System.out.println("Course:");
					break;
					
					

				}
				}

			

			int coursListIndex =0;
			boolean addCourse = true;
			while (addCourse) {
				Courses cour = new Courses();
				departmentList.get(depListIndex).TeacherList.get(techListIndex).StudList.get(studListIndex).CoursList.add(cour);

				System.out.println("Enter Course Name:  ");
				String courName = sc.next();
				departmentList.get(depListIndex).TeacherList.get(techListIndex).StudList.get(studListIndex).CoursList.get(coursListIndex).setCourName(courName);
				//cour.setCourName(courName);

				System.out.println("Enter Course id:  ");
				int courId = sc.nextInt();
				departmentList.get(depListIndex).TeacherList.get(techListIndex).StudList.get(studListIndex).CoursList.get(coursListIndex).setCourId(courId);
				//cour.setCourId(courId);

				System.out.println("Do you want to Enter Other Course? (yes/no):  ");
				String answer3 = sc.next();
				dep.tech.stud.CoursList.add(cour);
				if (answer3.equals("yes")) {
					System.out.println("Next Course:");
					addCourse = true;
					coursListIndex++;
				

				} else if (answer3.equals("no")) {
					addCourse = false;
					System.out.println("Supject with Mark:");
					break;

				}

			}
			int markListIndex=0;
			boolean addMark = true;
			while (addMark) {
				Marks mark = new Marks();
				departmentList.get(depListIndex).TeacherList.get(techListIndex).StudList.get(studListIndex).CoursList.get(coursListIndex).markList.add(mark);

				System.out.println("Enter three supject:  ");

				String subN_1 = sc.next();
				String subN_2 = sc.next();
				String subN_3 = sc.next();
				System.out.println(subN_1);
				System.out.println(subN_2);
				System.out.println(subN_3);

				System.out.println("Enter Three Marks of Each Mark");
				departmentList.get(depListIndex).TeacherList.get(techListIndex).StudList.get(studListIndex).CoursList.get(coursListIndex).markList.get(markListIndex).markAvrg();
				//mark.markAvrg();

				System.out.println("Do you want to add new Mark? yes/no");
				String answer4 = sc.next();
				dep.tech.stud.cour.markList.add(mark);
				if (answer4.equals("yes")) {
					System.out.println("Next Student Mark:");
					addMark = true;
					markListIndex++;
					
				
				} else if (answer4.equals("no")) {
					addMark = false;
					System.out.println("end:");
					break;

				
				}}
			
			departmentList.add(dep);

			System.out.println("Do you want to add new department? yes/no");
			String answer10 = sc.next();
			if (answer10.equals("yes")) {
				addDepartment = true;
				depListIndex++;
				System.out.println("Next Department");
			} else if (answer10.equals("no")) {
				addDepartment = false;
			
			
				// break;
				System.out.println("Thanks");
				System.out.println("**************************");
				System.out.println();
				System.out.println("School Name:" + sch.getNameOfSchool());
				System.out.println();

				for (int i = 0; i < departmentList.size(); i++) {
					//departmentList.get(i).getDepNum();
					// for (Department dep1 : departmentList) {
					System.out.println("Department Name:" + departmentList.get(i).getNameOfDep());
					System.out.println("Department id:" + departmentList.get(i).getDepNum());

					for (int j = 0; j < departmentList.get(i).getTeacherList().size(); j++) {
						// for (Teacher tech1 : dep1.TeacherList) {
						System.out.println("Teacher Name: " + departmentList.get(i).TeacherList.get(j).getTeachName());
						System.out.println("Teacher id: " + departmentList.get(i).TeacherList.get(j).getTeachId());
						
						//departmentList.get(i).TeacherList.get(j).StudList.size();
						for (int t = 0; t < departmentList.get(i).TeacherList.get(j).StudList.size(); t++) {
							// for (Student stud1 : dep1.tech.StudList) {
							System.out.println("Student Name: "
									+ departmentList.get(i).TeacherList.get(j).StudList.get(t).getStudName());
							System.out.println("Student id: "
									+ departmentList.get(i).TeacherList.get(j).StudList.get(t).getStudId());

							for (int d = 0; d < departmentList.get(i).TeacherList.get(j).StudList.get(t).getCoursList()
									.size(); d++) {
								// for (Courses cour1 : dep1.tech.stud.CoursList) {
								System.out.println("Course Name: "
										+ departmentList.get(i).TeacherList.get(j).StudList.get(t).CoursList.get(d)
												.getCourName());
								System.out.println("Course id: "
										+ departmentList.get(i).TeacherList.get(j).StudList.get(t).CoursList.get(d)
												.getCourId());

								for (int a = 0; a < departmentList.get(i).TeacherList.get(j).StudList.get(t).CoursList
										.get(d).getMarkList().size(); a++) {
									// for (Marks mark1 : dep1.tech.stud.cour.markList) {
									System.out.println("Supject & Marks Grade : "
											+ departmentList.get(i).TeacherList.get(j).StudList.get(t).CoursList
													.get(d).markList.get(a).grade);
									System.out.println();
									System.out.println();
								}
							}

						}
					}

				}
			}
		}
	
	}}
	
