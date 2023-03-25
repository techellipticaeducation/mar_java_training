package conditionstatement;

public class JumpStatementDemo {
	public static void main(String[] args) {
		
		// Break; - to break a loop
		// Continue; - to skip the iterator
		
		for(int i = 1 ; i <= 10 ;i++) {
			System.out.println(i);
			
			if(i == 5) {
				continue;
			}
			
			System.out.println("Hello");		
		}
		
		
		
		
	}
}
