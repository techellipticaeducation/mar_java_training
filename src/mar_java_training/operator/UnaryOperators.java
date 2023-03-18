package mar_java_training.operator;

public class UnaryOperators {
public static void main(String[] args) {
	// Increment 
	
	// pre  increment - first increase then assign      ++i
	// post increment - first assign then increase      i++
	
	int i = 10;
	int j = i-- + --i + i-- + --i + i-- + --i; 
       //   10  + 8 + 8 +      6 +  6 + 4 =	
	
	System.out.println("i => " + i);
	System.out.println("j => " + j);
	
	
	
	// 
	
	boolean bol = true;
	System.out.println(!bol);

}
}
