import java.util.Scanner;

public class Task8ForStrings {

	public static void main(String[] args) {
//		�� �� ������� ��������, ���� ����� �� ������� ��� �� �������
//		(������, ���).
//		���������� �� ������ �� ������ ���� ��������� ������ � ���������,
//		�.�. ���� ����� ������-������� � �������-������ � ���� � ���.

		System.out.println("�������� ����:");
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
			System.out.println("������ � ���������");
		} else {
			System.out.println("������ �� � ���������");
		}
		sc.close();
	}

}
