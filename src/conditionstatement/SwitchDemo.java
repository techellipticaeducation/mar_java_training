package conditionstatement;

public class SwitchDemo {
	
	public static void main(String[] args) {
		
		// if   else		
		
		// case  default
		String dayName = "friday";
		int dayNumber = 0;
		switch(dayName) {
		case "Sunday":
		case "sunday":
		case "Sun":
		case "sun":
			dayNumber = 1;
			break;
		case "Monday":
		case "monday":
			dayNumber = 2;
			break;
		case "Tuesday":
		case "tuesday":
			dayNumber = 3;
			break;
		default:
			dayNumber = -1;
		}
		
		System.out.println(dayName + " - " + dayNumber);
		
		
		
	}
}
