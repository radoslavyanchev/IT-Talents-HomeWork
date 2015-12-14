import java.util.Scanner;

public class Task9ForStrings {

	public static void main(String[] args) {
		// Да се състави програма, чрез която по въведен низ съдържащ букви,
		// цифри, знак минус '-' се извежда сборът на въведените числа като се
		// отчита знакът '-' пред съответното число.

		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();

		int sum = 0;
		boolean sing = false;
		int numberSum = 0;
		boolean flagFirstNumber = false;

		for (int i = 0; i < text.length(); i++) {
			if ((text.charAt(i) == '-')) {
				sing = true;

				if (numberSum != 0) {
					System.out.println(numberSum);
					sum += numberSum;
					numberSum = 0;
				}
			}
			if ((text.charAt(i) >= '0') && (text.charAt(i) <= '9')) {
				if (flagFirstNumber == false) {
					numberSum = Character.getNumericValue(text.charAt(i));
					flagFirstNumber = true;
					continue;
				} else {
					numberSum = (numberSum * 10) + Character.getNumericValue(text.charAt(i));
					continue;
				}
			} else {
				if (numberSum != 0) {
					if (sing) {

						System.out.println(numberSum * (-1));
						sum = sum + (numberSum * (-1));
					} else {
						System.out.println(numberSum);
						sum = sum + numberSum;
					}
					sing = false;
					numberSum = 0;
				}
			}
			// System.out.println(sum);
		}
		// System.out.println("EDN FOR");
		if (numberSum != 0) {
			if (sing) {
				System.out.println("-" + numberSum);

				sum -= numberSum;
			} else {
				System.out.println(numberSum);
				sum += numberSum;
			}
		}
		// System.out.println(numberSum);
		System.out.println("Сумата на числата е : " + sum);
	}

}
