package ifelsStatement;

public class LogicalOperator {

	public static void main(String[] args) {

		int month = 2;
		int day = 29;

		if (month == 2 && day == 29) {
			System.out.println("leap year");

		} else {
			System.out.println("not a leap year");
		}

		int tenth = 60;
		int twelth = 65;
		int degree = 65;
		if (tenth >= 60 && twelth >= 60 && degree >= 65) {
			System.out.println("you are qualified");
		} else {
			System.out.println("you are not qualified");
		}
			
	}

}
