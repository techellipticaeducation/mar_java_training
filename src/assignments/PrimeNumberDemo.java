package assignments;

import java.util.Scanner;

public class PrimeNumberDemo {
	public static void main(String[] args) {
		// 1 and itself
		System.out.println("Welcome to Prime Number Finder");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Number : ");	
		int finalNumber = scan.nextInt();
		
		for(int i = 3 ;i < finalNumber ; i+=2) {
			boolean isPrime = true;
			
			// 13 , 3,5,7,9,11 , reminder != 0
			
			for(int j= 3 ; j < i ; j+=2) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println(i);
			}
			
			
			
			
		}
		
	}
}
