import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// �� �� ������� ��������, ���� ����� �� �������� 7 ���� ����� �
		// ��������� �����.
		// ���������� �� ������ �������, ����� � ���-������ �� ��������
		// �������� �� ���������� �����.

		Scanner sc = new Scanner(System.in);
		int n=7;
		int[] array = new int[n];
		int sum=0;
		int avg=0;
		int[] array2= new int[n];
		int minIndex=0;
		 
		for(int index = 0; index < n; index++){
			System.out.println("Enter value for array for position " + index + "=");
			 array[index] = sc.nextInt();
			sum= sum+ array[index];
			
		}
		avg=sum/n;
		int min=(avg-array[0])>0?(avg-array[0]):(avg-array[0])*(-1);
		for(int index=0;index<n;index++){
			array2[index]=(avg-array[index])>0?(avg-array[index]):(avg-array[index])*(-1);
			if(array2[index]<min){
				min=array2[index];
				minIndex=index;
			}		
		}
		System.out.println(avg);
		System.out.println(array[minIndex]);
		sc.close();
	}

}
