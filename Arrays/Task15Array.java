import java.util.Scanner;

public class Task15Array {

	public static void main(String[] args) {
		// �� �� ������� ��������, ����� ������� � ��������� ����� ������
		// �����.
		// ���� �����: �������� ������� ����� 3 �������� �����, �����
		// ��������� �������� ������� ������������ ���� ����.

		Scanner sc = new Scanner(System.in);

		System.out.println("�������� �������� �� ������ :");
		int n = sc.nextInt();

		double[] array = new double[n];

		for (int index = 0; index < n; index++) {
			array[index] = sc.nextDouble();

		}
		double min = Double.MIN_VALUE;
		double middle = Double.MIN_VALUE;
		double max = Double.MIN_VALUE;
		for (int index = 0; index < n; index++) {
			if (array[index] > max) {
				max = array[index];
			}
		}
		for (int index = 0; index < n; index++) {
			if ((array[index] > middle) && (array[index] < max)) {
				middle = array[index];
			}
		}
		for (int index = 0; index < n; index++) {
			if ((array[index] > min) && (array[index] < middle)) {
				min = array[index];
			}
		}

		System.out.println(min + "| " + middle + " |" + max);
		
		sc.close();
	}

}
