
public class Task5 {

	public static void main(String[] args) {
		// Да се състави програма, при която предварително са въведени
		// естествени числа в двумерен масив 4*4 елемента.
		// Програмата да извежда резултат от проверката какво е съотношението
		// на най-голямата сума по редове спрямо най-голямата сума по колони.

		int sumRow = -Integer.MIN_VALUE;
		int sumCol = -Integer.MIN_VALUE;
		int sum = 0;
		int[][] array = { 
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
				};
		int n = array.length;
		int m = n;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < m; col++) {
				sum += array[row][col];
			}
			if (sum > sumRow) {
				sumRow = sum;
			}
			sum = 0;
		}

		for (int row = 0; row < n; row++) {
			for (int col = m - 1; col >= 0; col--) {
				sum += array[col][row];
			}
			if (sum > sumCol) {
				sumCol = sum;
			}
			sum = 0;
		}

		System.out.println(" MAX Sum Columns");
		System.out.println(" MAX Sum Rows");

		if (sumCol < sumRow) {
			System.out.println("The maximum amount of rows is > than the maximum amount of columns");
		}
		else {
			System.out.println("The maximum amount of rows is < than the maximum amount of columns");
		}

	}

}
