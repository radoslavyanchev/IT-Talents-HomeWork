import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
//		Да се състави програма, чрез която се въвежда число и се представя
//		като число в двоична бройна система.
//		Програмата, чрез масив, да изчислява последователно всички цифри
//		на въведеното естествено число в 2-ична бройна система.
		
		
		int number,m,count=0,c;
		System.out.println("Въведете число :");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
			m=number;

		while(number!=0){
			c=number%2;
			number= (number/2);

			count++;
		}

		int[] array = new int[count];

		for(int index=count-1; index>=0;index--){
			c=m%2;
			m= (m/2);
			array[index]=c;	
		}
		System.out.println("Числото 99 = ");
		for(int index=0; index<count; index++){
			System.out.print(array[index]);
		}
		sc.close();
	}

}
