
public class Task14ForStrings {
	static int factorial(int n) {
		if (n < 0) {
			System.out.print("������� � ����������� : ");
			return n;
		}
		if (n == 0) {
			return 1;
		}

		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		// �� �� ������� �����, ����� ������ �� �������� ����� N � �����
		// ���������� �� N! (N ���������).
		int b = factorial(-5);
		System.out.println(b);
	}

}
