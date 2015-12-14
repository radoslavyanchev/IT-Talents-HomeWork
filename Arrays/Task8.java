public class Task8 {

	public static void main(String[] args) {
		// Напишете програма, която намира и извежда най-дългата редица от
		// еднакви поредни елементи в даден масив.

		int[] array = { 1, 1, 1, 2, 3, 8, 8, 9, 9, 9, 9, 55, 55 };

		// Масив в който се държат броя на повторенията
		int[] arrayCount = new int[array.length];
		int arrayCountIndex = 0;

		// Масив в който се държи индекса от входния масив
		int[] arrayIndex = new int[array.length];

		int count = 1;
		arrayCount[arrayCountIndex] = count;

		arrayIndex[0] = array[0];
		int arrayIndexValue = 0;
		for (int index = 1; index < array.length; index++) {
			if (array[index] == array[index - 1]) {
				arrayCount[arrayCountIndex]++;
			} else {
				arrayCountIndex++;
				arrayCount[arrayCountIndex]++;
				arrayIndexValue++;
				arrayIndex[arrayIndexValue] = array[index];
			}
		}
		int max = Integer.MIN_VALUE;
		int maxIndex = 0;
		for (int index = 0; index < arrayCount.length; index++) {
			if (arrayCount[index] > max) {
				max = arrayCount[index];
				maxIndex = arrayIndex[index];
			}
		}

		System.out.println("Числото " + array[maxIndex]);
		System.out.println("се повтаря " + max);

	}

}