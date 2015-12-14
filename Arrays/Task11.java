import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// Да се състави програма, която въвежда от клавиатурата 7 цели числа
		// в едномерен масив
		// Програмата да изведе всички числа кратни на 5, но по големи от 5.

		Scanner sc = new Scanner(System.in);
		int n = 7;
		int[] array = new int[n];
		int count = 0;
		for (int index = 0; index < n; index++) {
			System.out.println("Enter value for array for position " + index + "=");
			array[index] = sc.nextInt();
		}
		for (int index = 0; index < n; index++) {
			if ((array[index] > 5) && (array[index] % 5 == 0)) {
				System.out.print(array[index] + " ");
				count++;
			}
		}
		System.out.print(" - ");
		System.out.print(count + " числа");
		sc.close();
	}
}
