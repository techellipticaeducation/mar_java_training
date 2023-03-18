package mar_java_training.operator;

public class BitwiseAndLogicalOperator {
	public static void main(String[] args) {
		// And and Or operator
		
		//	And Gate (ziddi)
		// true true = true
		// true false = false
		// false true = false
		// false false = false
		
		// & - bitwise and operator
		// && - Logical and operator
		
//		boolean ret = returnFalse() && returnTrue();
//		System.out.println(ret);
		
		//	Or Gate 
		// true true = true
		// true false = true
		// false true = true
		// false false = false
		
		// | - bitwise or operator
		// || - Logical or operator
		
		boolean orRet = returnFalse() || returnTrue();
		System.out.println(orRet);
		
	}
	
	public static boolean returnTrue() {
		System.out.println("i am true");
		return true;
	}
	
	public static boolean returnFalse() {
		System.out.println("i am false");
		return false;
	}
}
