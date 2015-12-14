
public class TaskArray16 {

	public static void main(String[] args) {
//		Да се състави програма, чрез която предварително въведени 10
//		реални числа от интервала се обработват по следния начин:
//		1. Извежда съществуващите числа.
//		2. Всички елементи със стойност по-малки от -0.231 се заменят със
//		сумата от квадрата на индекса им + числото 41.25, а всички останали
//		елементи се заменят с произведението между самия елемент и
//		неговият пореден номер
//		3. Да се изведат елементите от началния и новообразувания масив.
//		4. Да се изведат средната стойност на всички елементи от новата
//		редица, които са различни от 0.
		
		
		double[] array = {-1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4};
		System.out.println("Входящ масив:");
		for(int index=0; index<array.length; index++){
			System.out.print(array[index] + ", ");
			if(array[index]<0.231){
				array[index]=(index*index)+41.25;
			}
			else{
				array[index]=array[index]*index;
			}
		}
		System.out.println();
		System.out.println("Преобразувам масив:");
		for(int index=0; index<array.length; index++){
			System.out.print((float)array[index] + ", ");
		}
		System.out.println();
		System.out.println("Преобразувам масив стойности > 0:");
		for(int index=0; index<array.length; index++){
			if(array[index]!=0){
			System.out.print((float)array[index] + ", ");
			}
		}
		
		

	}

}
