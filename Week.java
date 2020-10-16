package enumexample;

public class Week {
	
	public Day day;
	public Week(Day day) {
		this.day = day;
	}
	public Week() {
	}
	public void whatIsMyTask(String day) {
		switch(day) {
		
		case "Monday":
		System.out.println("Monday is our first Class of the week");
		break;
		case "Tuesday":
			System.out.println("Tuesday we start doing our homework");
			break;
		case "Wednesday":
			System.out.println("Wednesday we continue with home work and focus on CodeLab");
			break;
		case "Thursday":
			System.out.println("Thursday is our second Class of the week");
			break;
		case "Friday":
			System.out.println("Friday we start doing our homework");
			break;
		case "Saturday":
			System.out.println("Saturday we continue with CodeLab");
			break;
		case "Sunday":
			System.out.println("Sunday we read the Java Book");
			break;
			
		default:
			System.out.println("Not a valid Day, try with valid day");
			
		}
		
	}

}
