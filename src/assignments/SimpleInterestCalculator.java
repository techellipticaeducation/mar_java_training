package assignments;

import java.util.Scanner;

public class SimpleInterestCalculator {
	public static void main(String[] args) {
		
		// (p * r * t) /100
		
		System.out.println("Welcome to SimpleInterestCalculator");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Amount : ");
		int amount = scan.nextInt();
		
		System.out.println("Enter Your Rate : ");
		float rate = scan.nextFloat();
		
		System.out.println("Enter Your Time : ");
		int year = scan.nextInt();
		
		
		float interest = (amount * rate * year)/100;
		//char rupeeCode = '\u20B9';
		System.out.println("Total Interest : " + interest);
		float totalAmount  = amount + interest;
		System.out.println("Total Amount : " + totalAmount);
			
	}
}
