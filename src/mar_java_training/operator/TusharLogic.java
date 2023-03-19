package mar_java_training.operator;

public class TusharLogic {
public static void main(String[] args) {
	int a  = 45;
	int b  = 89;
	
	a = a % b; 
	b = b - a; 
	a = a + b;
	
	System.out.println("After swapping, "
			+ "a = " + a + " and b = " + b);
}
}
