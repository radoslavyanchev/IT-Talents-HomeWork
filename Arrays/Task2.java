
public class Task2 {

	public static void main(String[] args) {
		// Нека по въведен масив да се конструира нов, като половината му
		// елементи са точно като на оригиналния, а другите да са тези
		// елементи, но в обратен ред. Последно, да се изведе новия масив
		// на екрана.

		int[] array = { 10, 3, 5, 8, 10 };
		int[] doubleArray = new int[array.length * 2];

		for (int index = 0; index < array.length; index++) {
			doubleArray[index]=array[index];
		}
		int count= 1;
		for (int index = 0; index <array.length; index++) {
			doubleArray[doubleArray.length-count]=array[index];
			count++;
		}
		
		for(int index = 0; index<doubleArray.length ; index++){
			System.out.print(doubleArray[index] + " ");
		}

	}

}
