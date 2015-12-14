import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
//		Да се въведе число, след което да се създаде масив с 10
//		елемента по следния начин:
//		Първите 2 елемента на масива са въведеното число.
//		Всеки следващ елемент на масива е равен на сбора от
//		предишните 2 елемента в масива.
//		След това изведете масива .

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int number = sc.nextInt();
		
		int[] array = new int[10];
		
		array[0] = number;
		array[1] = number;
		
		for(int index = 2; index<10 ; index++){
			array[index]=array[index-1] + array[index-2];
		}
		
		for(int index = 0; index<array.length ; index++){
			System.out.print(array[index] + " ");
		}
		sc.close();
	}

}
