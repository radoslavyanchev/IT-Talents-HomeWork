import java.util.Arrays;
import java.util.Scanner;

public class Task12ForStrings {

	public static void main(String[] args) {
		// �� �� ������� �����, ����� ������ �� ������ ����� ����� N �
		// ����� ����� �� ����� � ������� N, ����� ������� ������ �����
		// �� 1 �� N.
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� N:");
		int n = sc.nextInt();
		int[] arrResult = nArr(n);
		System.out.print(Arrays.toString(arrResult));
		sc.close();
	}

	static int[] nArr(int n) {
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}

		return arr;
	}

}
