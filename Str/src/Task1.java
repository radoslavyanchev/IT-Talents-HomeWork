import java.util.Scanner;

public class Task1 {
	public static void bigChar(String str) {
		System.out.print(str.toUpperCase() + " ");

	}
	public static void smallChar(String str) {
		System.out.print(str.toLowerCase() + " ");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете думи : ");
		String str = sc.nextLine();
		String[] words = str.split(" ");

		for (int index = 0; index < words.length; index++) {
			bigChar(words[index]);
			smallChar(words[index]);
		}
		sc.close();
	}
}
