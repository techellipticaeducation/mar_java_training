package conditionstatement;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("Give me your input number Please");
		int i = scan.nextInt();
		while( i != -1) {
			int sum = 0;
			while( i != 0) {
				sum = sum  + (i % 10); // 0 + 5 + 5 + 4 + 1 
				i = i/10; // 0
			}
			System.out.println("Sum of "+i+" : " + sum);	
			System.out.println("Give me your input number Please");
			i = scan.nextInt();
		}
		System.out.println("Ok. bye bye tata !");
		
		
		
		
	}
}
