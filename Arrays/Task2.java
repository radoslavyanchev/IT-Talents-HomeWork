
public class Task2 {

	public static void main(String[] args) {
		// ���� �� ������� ����� �� �� ���������� ���, ���� ���������� ��
		// �������� �� ����� ���� �� �����������, � ������� �� �� ����
		// ��������, �� � ������� ���. ��������, �� �� ������ ����� �����
		// �� ������.

		int[] array = { 10, 3, 5, 8, 10 };
		int[] doubleArray = new int[array.length * 2];

		for (int index = 0; index < array.length; index++) {
			doubleArray[index]=array[index];
		}
		int count= 1;
		for (int index = 0; index <array.length; index++) {
			doubleArray[doubleArray.length-count]=array[index];
			count++;
		}
		
		for(int index = 0; index<doubleArray.length ; index++){
			System.out.print(doubleArray[index] + " ");
		}

	}

}
