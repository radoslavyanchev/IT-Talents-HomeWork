import java.util.Scanner;

public class Task10ForStrings {

	public static void main(String[] args) {
		// Да се състави програма, която по даден низ връща друг,
		// символите, на който са получени като към всеки код на символ
		// от ASCII таблицата е добавеното числото 5 и е записан
		// новополучения символ.

		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();
		char[] newWordArr = new char[word.length()];
		for (int index = 0; index < word.length(); index++) {
			newWordArr[index] = (char) (word.charAt(index) + 5);
		}

		String newWord = new String(newWordArr);
		System.out.println(newWord);
		sc.close();
	}

}
