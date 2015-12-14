import java.util.Arrays;

public class Task13ForStrings {

	public static void main(String[] args) {
		// Да се създаде метод, който приема два масива от числа и връща
		// масив, съдържащ всички елементи на подадените масиви, като в
		// първата част на масива са елементите на първия подаден масив,
		// а във втората част – тези на втория подаден масив.
		
		
		int[] arrFirst={1,2,3};
		int[] arrSecond ={4,5,6};
		
		int[] arrResult= assemblingArrays(arrFirst, arrSecond);
		System.out.println(Arrays.toString(arrResult));
		

	}

	static int[] assemblingArrays(int[] arrFirst, int[] arrSecond) {
		int[] arrResult = new int[arrFirst.length + arrSecond.length];

		for (int i = 0; i < arrFirst.length; i++) {
			arrResult[i] = arrFirst[i];
		}
		for (int i = 0; i < arrSecond.length; i++) {
			arrResult[i + arrFirst.length] = arrSecond[i];
		}

		return arrResult;
	}

}
