import java.util.Scanner;

public class task12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter day:");
		int day = sc.nextInt();

		System.out.println("Enter month:");
		int month = sc.nextInt();

		System.out.println("Enter year:");
		int year = sc.nextInt();

		// check for Leap year
		int leapYear = 0;
		if (year % 400 == 0) {
			leapYear = 1;
		} else {
			if (year % 100 == 0) {
				leapYear = 0;
			}
		}

		if (year % 4 == 0) {
			leapYear = 1;
		} else {
			leapYear = 0;
		}
		// check for 29.02.XXXX
		if ((month == 2) && (leapYear == 1) && (day == 28)) {
			day++;
		} else {
			if ((month == 2) && day == 28) {
				month++;
				day = 1;
			}
		}

		// check for month whit 30 days
		if (day == 30 && ((month == 4) || (month == 6) || (month == 9) || (month == 11))) {
			month++;
			day = 1;
		}

		if((day==31) && (month != 12)){
			month++;
			day=1;
		}
		
		else {
			if ((month != 12) && (month != 2) && (day == 30)) {
				day++;
			}
		}
		// check for new year
		if ((month == 12) && (day == 31)) {
			month = 1;
			day = 1;
			year++;
		}
		System.out.println(day + "." + month + "." + year);
	}

}
