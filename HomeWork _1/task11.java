import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number between 111 and 999");

		int numberOriginal = sc.nextInt();
		int number = numberOriginal;
		int count = 0;

		if (numberOriginal % (number % 10) > 0) {
			count++;
		}

		number = number / 10;
		if (numberOriginal % (number % 10) > 0) {
			count++;
		}

		number = number / 10;
		if (numberOriginal % number > 0) {
			count++;
		}

		if (count > 0) {
			System.out.println("The number is not divisible by all its figures");
		} else {
			System.out.println("Number divisible by all its figures");
		}

	}

}
