import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
//		�� �� ������� ��������, ���� ����� �� ������������� �������� 7
//		����� � ��������� ����� �� �������� ������� �� �������� � �������:
//		- 0 � 1 ���� ����� ����������;
//		- 2 � 3 ���� ��������;
//		- 4 � 5 ���� ���������.

		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[7];
		for(int index =0; index<7;index++){
			System.out.println("�������� �������� �� ������� [" + index + "] = ");
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
