import java.util.Scanner;

public class Task8ForStrings {

	public static void main(String[] args) {
//		Да се състави програма, чрез която се въвежда ред от символи
//		(стринг, низ).
//		Програмата да изведе на екрана дали въведения стринг е палиндром,
//		т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.

		System.out.println("Въведете дума:");
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();
		boolean flag = true;
		for (int index = 0; index < word.length() / 2; index++) {
			if (word.charAt(index) != word.charAt(word.length() - index - 1)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Думата е палиндром");
		} else {
			System.out.println("Думата не е палиндром");
		}
		sc.close();
	}

}
