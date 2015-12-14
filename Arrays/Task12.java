import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
//		Да се състави програма, чрез която по предварително въведени 7
//		числа в едномерен масив се разменят местата на елементи с индекси:
//		- 0 и 1 чрез трета променлива;
//		- 2 и 3 чрез събиране;
//		- 4 и 5 чрез умножение.

		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[7];
		for(int index =0; index<7;index++){
			System.out.println("Въведете стойност за позиция [" + index + "] = ");
			array[index]=sc.nextInt();
		}
		
		int swap= array[0];
		array[0]= array[1];
		array[1]= swap;
		
		
		array[2]=array[2]+array[3];
		array[3]= array[2]-array[3];
		array[2]=array[2]-array[3];
		
		array[4]=array[4]*array[5];
		array[5]= array[4]/array[5];
		array[4]=array[4]/array[5];
		
		for(int index =0; index<7;index++){
			System.out.print(array[index] + " " );
		}
		sc.close();
	}

}
