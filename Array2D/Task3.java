
public class Task3 {

	public static void main(String[] args) {
		// ����� �������� ����� �� �����, ����� ��������� �� ��������
		// �������������. �� �� ��������� ������ �� ���������� �� ������,
		// ����� � ������������������� �� ���� �����.

		int[][] array = { 
				{ 48, 72, 13, 14, 15 },
				{ 21, 22, 53, 24, 75 },
				{ 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 },
				{ 61, 69, 63, 64, 65 }
				};
		int n = array.length;
		int m = array[0].length;
		int count = 0;
		int sum = 0;
		int avg;

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < m; col++) {
				sum += array[row][col];
				count++;
			}
		}

		avg = sum / count;

		System.out.println("������ � :" + sum);
		System.out.println("�������������������  � :" + avg);

	}

}
