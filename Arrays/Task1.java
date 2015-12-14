
public class Task1 {

	public static void main(String[] args) {
//		Да се прочете масив и да се намери най-малкото число кратно на
//		3 от масива.

		int[] array = { 10, 3, 5, 8, 6, -3, 7 };
		int min = Integer.MAX_VALUE;
		
		for (int index = 0; index < array.length; index++) {
			if (array[index] % 3 == 0) {
				if (array[index] < min) {
					min = array[index];
				}
			}
		}
		
		System.out.println(min);
	}

}
