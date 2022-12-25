package aisha;

import java.util.Scanner;

public class rev {
	public static void RevNum(int number) {
		
	if(number < 10)	{
		System.out.println(number);
		return;
	}
  else {
	  
	  System.out.print(number%10);
	  RevNum(number/10);
	}
			
	}
	
	public static void main (String args[])
	{
		System.out.print("Enter the numert you want to reverse : " );
		Scanner sc = new Scanner (System.in); 
		int num=sc.nextInt();
		System.out.print("the revers of given numbers is : ");
		RevNum(num);
	}

}
