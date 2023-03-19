package conditionstatement;

public class WeekdayDemo {
	public static void main(String[] args) {
		// Sunday = 1
		// Monday = 2
		// Tuesday = 3
		// Wednesday = 4
		// Thursday = 5
		// Friday = 6
		// Saturday = 7

		String dayName = "friday";
		int dayNumber = -1;
		if(dayName.equals("Sunday") || dayName.equals("sunday")) {
			dayNumber = 1;
		}else if(dayName.equals("Monday") || dayName.equals("monday")) {
			dayNumber = 2;
		}else if(dayName.equals("Tuesday") || dayName.equals("tuesday")) {
			dayNumber = 3;
		}else if(dayName.equals("Wednesday") || dayName.equals("friday")) {
			dayNumber = 4;
		}else if(dayName.equals("Thursday") ||  dayName.equals("thursday")) {
			dayNumber = 5;
		}else if(dayName.equals("Friday") || dayName.equals("friday")) {
			dayNumber = 6;
		}else if(dayName.equals("Saturday") || dayName.equals("saturday")) {
			dayNumber = 7;
		}

		System.out.println(dayName + " - " + dayNumber);

		
//		switch
	}
}
