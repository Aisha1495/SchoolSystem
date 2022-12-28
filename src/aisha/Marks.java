package aisha;

import java.io.Serializable;
import java.util.Scanner;

public class Marks  {
	private String SupjMark;
	private float Mark;
	char grade;

	
	public void markAvrg() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three Marks :\n");
		float sub_1 = sc.nextFloat();
		float sub_2 = sc.nextFloat();
		float sub_3 = sc.nextFloat();

		float total;
		float average;
		float percentage;
		

		total = sub_1 + sub_2 + sub_3;
		average = (float) (total / 3.0);
		percentage = (float) ((total / 300.0) * 100);

		if (average >= 90)
			grade = 'A';
		else if (average >= 80)
			grade = 'B';
		else if (average >= 70)
			grade = 'C';
		else
			grade = 'D';

		System.out.println("\n The Total Marks=" + total);
		System.out.println("Thge avarage marks =" + average);
		System.out.println("the perecntage =" + percentage);
		System.out.println("the Grade =" + grade);

	}
	
	

	public float getMark() {
		return Mark;
	}

	public void setMark(float mark) {
		Mark = mark;

	}

	public String getSupjMark() {
		return SupjMark;
	}

	public void setSupjMark(String supjMark) {
		SupjMark = supjMark;
	}

}
