
public class Task18 {

	public static void main(String[] args) {
//		Дадени са два едномерни масива с естествени числа.
//		Да се състави програма, която сравнява всички числа с еднакви
//		индекси от двата масива и записва в трети масив, по-голямото от
//		двете числа.
//		Да се изведе съдържанието и на трите масива


		int[] arrayA = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] arrayB = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int[] arrayC = new int[arrayA.length];
		
		for(int index = 0 ;index < arrayA.length; index++){
			System.out.print(arrayA[index] + ", ");
		}
		System.out.println();
		for(int index = 0 ;index < arrayB.length; index++){
			System.out.print(arrayB[index] + ", ");
		}
		System.out.println();
		for(int index = 0 ;index < arrayA.length; index++){
			if(arrayA[index]>arrayB[index]){
				arrayC[index] = arrayA[index];
			}
			else{
				arrayC[index]=arrayB[index];
			}
			System.out.print(arrayC[index] + ", ");
		}

	}

}
