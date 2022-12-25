package aisha;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {

	double firstNum , secondNum;
	double output;
	
	Scanner sc =new Scanner(System.in);
	do {
		System.out.println("=============================================");
		System.out.println("1) + for Addition");
		System.out.println("2) - for Subtraction");
		System.out.println("3) * for Multiplication");
		System.out.println("4) / for Dividing");
		System.out.println("5) % for Rimindier");
		System.out.println("6) Q for Finish");
		System.out.println("=============================================");
		

		System.out.println("Enter first Number :  ");
		firstNum=sc.nextDouble();
		System.out.println("Enter Second Number :   ");
		secondNum=sc.nextDouble();
		System.out.println("Enter The qurie (+,-,*,/,% or Q) :");
		output=sc.nextDouble();
		
		char operator = sc.next().charAt(0);
		switch (operator){
		case '+':
			output=firstNum + secondNum;
			break;
		case '-':
			output=firstNum - secondNum;
		case '*':
			output=firstNum * secondNum;
		case '/':
			output=firstNum / secondNum;
		case '%':
			output=firstNum % secondNum;
		case 'Q':
			System.exit(0);
			
		default:
			System.out.printf("Please enter specified operator only");
			return;
		}
		
		System.out.println(firstNum + " " + operator + " " + secondNum + " is : " + output);
	} while (output != 'Q');
			
			
		

}
	}