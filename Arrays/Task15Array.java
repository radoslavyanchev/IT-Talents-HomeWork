import java.util.Scanner;

public class Task15Array {

	public static void main(String[] args) {
		// Да се състави програма, която въвежда в едномерен масив реални
		// числа.
		// Като изход: програма извежда онези 3 различни числа, чиято
		// абсолютна стойност формира максималната обща сума.

		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете гомемина на масива :");
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
