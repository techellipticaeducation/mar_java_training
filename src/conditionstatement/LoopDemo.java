package conditionstatement;

public class LoopDemo {
	public static void main(String[] args) {

		// while - when you dont know how many time you have to run that loop
		// do while -  when you dont know how many time you have to run that loop. run atleast once
		//  for - when we know how many times we need to run the loop

		// airport - while
		// first it chekc the condtion then execute the loop body
		//		int i =20;
		//		while(i <  10) {
		//			System.out.println("hello => " + i);
		//			i++;
		//		}

		//  first it execute the loop body , then it check the condition
//		int i = 20;	
//		do {
//			System.out.println("hello => " + i);
//			i++;
//		}while(i <  10);

		
		// For loop
		// i - initilize
		//  i condition
		//  increment
		
		for(int i = 1, j = 1  ; i < 10 || j < 20 ; i++, j++ ) {
			System.out.println("hello => " + i);
		}

	}
}
