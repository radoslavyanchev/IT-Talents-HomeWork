
public class TaskArray16 {

	public static void main(String[] args) {
//		�� �� ������� ��������, ���� ����� ������������� �������� 10
//		������ ����� �� ��������� �� ���������� �� ������� �����:
//		1. ������� �������������� �����.
//		2. ������ �������� ��� �������� ��-����� �� -0.231 �� ������� ���
//		������ �� �������� �� ������� �� + ������� 41.25, � ������ ��������
//		�������� �� ������� � �������������� ����� ����� ������� �
//		�������� ������� �����
//		3. �� �� ������� ���������� �� �������� � ��������������� �����.
//		4. �� �� ������� �������� �������� �� ������ �������� �� ������
//		������, ����� �� �������� �� 0.
		
		
		double[] array = {-1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4};
		System.out.println("������ �����:");
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
		System.out.println("������������ �����:");
		for(int index=0; index<array.length; index++){
			System.out.print((float)array[index] + ", ");
		}
		System.out.println();
		System.out.println("������������ ����� ��������� > 0:");
		for(int index=0; index<array.length; index++){
			if(array[index]!=0){
			System.out.print((float)array[index] + ", ");
			}
		}
		
		

	}

}
