import java.util.Scanner;

public class Task10ForStrings {

	public static void main(String[] args) {
		// �� �� ������� ��������, ����� �� ����� ��� ����� ����,
		// ���������, �� ����� �� �������� ���� ��� ����� ��� �� ������
		// �� ASCII ��������� � ���������� ������� 5 � � �������
		// ������������� ������.

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
