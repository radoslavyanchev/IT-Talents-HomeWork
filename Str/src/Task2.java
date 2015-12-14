import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Да се състави програма, чрез която от клавиатурата се въвеждат
		// последователно две думи с дължина 10-20 знака.
		// Програмата да размени първите им 5 знака и да изведе дължината на
		// по-дългата, както и новото им съдържание.

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.split(" ");
		int first = 0;
		int second = 1;
		
		if (words[0].length() < words[1].length()) {
			first = 1;
			second = 0;
		}

		System.out.print(words[first].length() + " ");
		for (int index = 0; index < 5; index++) {
			System.out.print(words[second].charAt(index));
		}
		for (int index = 5; index < words[0].length(); index++) {
			System.out.print(words[first].charAt(index));
		}

		sc.close();
	}

}
