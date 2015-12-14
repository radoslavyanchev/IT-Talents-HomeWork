
public class Task5 {

	public static void main(String[] args) {
//		Напишете програма, която създава масив с 10 елемента и
//		инициализира всеки от елементите със стойност, равна на индекса на
//		елемента, умножен по 3.
//		Да се изведат елементите на екрана.

		int[] array = new int[10];
		
		for (int index = 0 ; index<10; index++){
			array[index]=index*3;
		}
		
		for(int index = 0; index<array.length ; index++){
			System.out.print(array[index] + " ");
		}
	}

}
