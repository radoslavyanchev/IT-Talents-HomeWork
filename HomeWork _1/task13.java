import java.util.Scanner;

public class task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.split(" ");

		for (int index = 0; index < words.length; index++) {
			System.out.print(words[index].toUpperCase() + " ");
			System.out.print(words[index].toLowerCase() + " ");
		}

	}

}
