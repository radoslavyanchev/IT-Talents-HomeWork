
public class Task4 {

	public static void main(String[] args) {
		// �� �� ������� ����� � �� �� �������� ���� � ���������.

//		int[] array = { 10, 3, 5, 8, 5, 3, 10 };
		int[] array = { 10, 3, 5, 8, 5, 3, 10, 11 };
		boolean flag = true;
		for (int index = 0; index < array.length/2; index++) {
			if(array[index]!=array[array.length-1-index]){
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("������ � ���������");
		}
		else{
			System.out.println("������ �� � ���������");
		}
	}

}
