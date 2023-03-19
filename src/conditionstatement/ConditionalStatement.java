package conditionstatement;

public class ConditionalStatement {
	public static void main(String[] args) {
		
		// Age Group
		//  <= 18  = Child
		//  18 - 30 = Adult
		//  30 - 45 = Mature
		//    > 45 = Old
		
		int age = 32;
		String ageGroup = "";
//		
		
		
		if(age <= 18) {
			ageGroup = "Child";
		}else if(age > 18 && age <= 30){
			ageGroup = "Adult";
		}else if(age >30 && age <= 45){
			ageGroup = "Mature";
		}else {
			ageGroup = "Old";
		}
		
		System.out.println(ageGroup);
		
		// Ternary Operator
		
//		String ageGroup = age <= 18 ? "Child" : "Adult";
//		System.out.println(ageGroup);
		
		
		
		
		
		
		
		
		
		
	}
}
