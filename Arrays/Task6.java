
public class Task6 {

	public static void main(String[] args) {
		// �������� ��������, ����� ����� ���� 2 ������ � ����� �������
		// ��������� ���� �� �������, � ���� �� � ������� ������.

		int[] arrayFirst = { 10, 3, 5, 8, 6, -3, 7 };
		int[] arraySecond = { 10, 3, 5, 8, 6, -3,8};
		boolean flag = true;
		if (arrayFirst.length != arraySecond.length) {
			System.out.println("�������� �� � �������� �������.�� �� �������");
		} 
		else {
			System.out.println("�������� �� � ������� �������");
			for (int index = 0; index <= arrayFirst.length - 1; index++) {
				if (arrayFirst[index] != arraySecond[index]) {
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("�������� �� �������");
			}
			else{
				System.out.println("�� �� �� �������");
			}
		}
		
		
	}

}
