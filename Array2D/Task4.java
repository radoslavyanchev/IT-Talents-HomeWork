
public class Task4 {

	public static void main(String[] args) {
		// Имате предварително въведени стойности на елементи в двумерен
		// масив - естествени числа.
		// Да се състави програма, чрез която се извеждат стойностите на
		// елементите в двумерен масив след обръщането му на +90 градуса

		
		int[][] arrayA = { 
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } 
				};
		int n = arrayA.length;
		int m = arrayA[0].length;

		int[][] arrayB = new int[n][m];

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < m; col++) {
				arrayB[col][n - 1 - row] = arrayA[row][col];
			}
		}

		for (int row = 0; row < m; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print(arrayB[row][col] + " ");
			}
			System.out.println();
		}

	}

}
