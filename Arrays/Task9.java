
public class Task9 {

	public static void main(String[] args) {
//		Напишете програма, в която потребителя въвежда масив, след което
//		елементите на масива се обръщат в обратен ред (Целта не е масива да
//		се отпечата в обратен ред, ами първо да се обърне, след което да се
//		отпечата в нормален ред). Пробвайте да решите задачата първо с един
//		допълнителен масив и после без да използвате друг масив.

		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for(int index=0; index<array.length;index++){
			System.out.print(array[index] + " ");
		}
		System.out.println();
		
		for(int index = 0 ; index<=array.length/2;index++){
			int swap=array[index];
			array[index]=array[array.length-1-index];
			array[array.length-1-index]=swap;
		}

		for(int index=0; index<array.length;index++){
			System.out.print(array[index] + " ");
		}
	}

}
