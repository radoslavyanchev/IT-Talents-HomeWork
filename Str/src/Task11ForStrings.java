
public class Task11ForStrings {

	
	
	public static void main(String[] args) {
//		Да се създаде метод, който отпечатва масив в конзолата.
		int[] Arr={1,4,5,6,6,7,7,8,};
		printArr(Arr);

	}
	static void printArr(int[] Arr){
		for (int i = 0; i < Arr.length; i++) {
			System.out.print(Arr[i] + " ");
		}
	}
}
