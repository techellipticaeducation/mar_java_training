package assignments;

import java.util.Scanner;

public class InputDemo {
	public static void main(String[] args) {

		
		System.out.println("Enter Your Value :");
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int square = i*i;
		int cube = i*i*i;
		
		System.out.println("Sqaure of value "+square);
		System.out.println("Cube of value "+cube);
		
		
	}
}
