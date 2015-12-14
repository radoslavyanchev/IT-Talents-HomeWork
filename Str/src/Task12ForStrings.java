import java.util.Arrays;
import java.util.Scanner;

public class Task12ForStrings {

	public static void main(String[] args) {
		// Да се създаде метод, който приема за входни данни число N и
		// връща масив от числа с дължина N, който съдържа всички числа
		// от 1 до N.
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете N:");
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
