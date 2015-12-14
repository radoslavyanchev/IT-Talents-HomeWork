import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// ����� ��������� �������� ����� �� ���������� �����, ����� ���������
		// �� �������� �� ���������. �� �� ��������� ����������� �� ������.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �������� �� ���� � �������� �� ��������� ��������� ����� :");
		int n = sc.nextInt();
		int[][] array = new int[n][n];

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.println("�������� ������� �� ������� [" + row + "][" + col + "]");
				array[row][col] = sc.nextInt();
			}
		}

		int col = 0;
		for (int row = 0; row< n; row++) {
			System.out.print(array[row][col] + " ");
			col++;
		}
		System.out.println();
		col = n-1;
		for (int row = 0; row < n; row++) {
			System.out.print(array[row][col] + " ");
			col--;
		}
		sc.close();
	}

}
