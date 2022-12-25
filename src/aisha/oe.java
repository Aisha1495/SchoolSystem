package aisha;

import java.util.Scanner;

public class oe {
	public static void main (String args[]) {
	
	int num;
	System.out.print("Enter number to check :");
	
	Scanner sc =new Scanner(System.in);
	num=sc.nextInt();
	
	
	if(num%2==0)
		
	System.out.println(num + "  is an even number");
	
	else
		System.out.println(num + "  is an odd number");
		

}
}
