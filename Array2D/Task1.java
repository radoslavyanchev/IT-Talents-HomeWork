
public class Task1 {

	public static void main(String[] args) {
		// ����� �������� ����� 6�5 �� ���������� �����, ����� ��������� ��
		// �������� �������������.
		// �� �� ������� ��������, ���� ����� �� �������� ���������� �� ������
		// � ���-������� � ���-�������� ��������.

		int n = 5;
		int m = 6;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int[][] a = {
				{ 48, 72, 13, 14, 15 },
				{ 21, 22, 53, 24, 75 },
				{ 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 },
				{ 61, 69, 63, 64, 65 }
				};

		for (int row = 0; row < m; row++) {
			for (int col = 0; col < n; col++) {

				if (a[row][col] < min) {
					min = a[row][col];
				}

				if (a[row][col] > max) {
					max = a[row][col];
				}
			}
		}

		System.out.println("MAX is : " + max);
		System.out.println("MIN is : " + min);
	}

}
