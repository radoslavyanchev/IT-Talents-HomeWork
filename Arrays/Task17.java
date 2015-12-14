public class Task17 {
	public static void main(String[] args) {
		// ���� ������ �� ���������� ����� �� �������� �������������� ������,
		// ��� �� ���������� � �� ���������� ���������:
		// N1 < N2 > N3 < N4 > N5 <..

		int[] a = { 1, 2, 1, 2, 1, 2, 1, 2, 1, 2 };

		boolean zigZag = true;

		for (int index = 1; index <= a.length - 2; index++) {
			boolean isBiggerLeftRight = (a[index] > a[index + 1]) && (a[index] > a[index - 1]);
			boolean isLowerLeftRight = (a[index] < a[index + 1]) && (a[index] < a[index - 1]);

			if (!(isBiggerLeftRight || isLowerLeftRight)) {
				zigZag = false;
				break;
			}
		}

		if (zigZag) {
			System.out.println("�������� � ��������������.");
		} else {
			System.out.println("�������� �� � ��������������.");
		}
	}
}