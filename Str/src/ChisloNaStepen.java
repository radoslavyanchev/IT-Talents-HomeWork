public class ChisloNaStepen {
	// ���������� �����,����� �������� ���� ����� �� �����
	// ��� � ����� ���� - ������ �� ��� ���� ��, ����� ���� ����
	
	static long multRecursively(long num, long times) {
		// �������� �� ���� �� ���������� // 0 �� ����� ����� � 0 // � ����� ����� �������� �� 1 // ���� ���� ��
		if (num == 0 || times == 0) {
			return 0;
		}
		if (times == 1) {
			return num;
		}
		// ����� �������� ���� ����� � ��������� �� // ������, �� ���� ��� � ���� ��� ��-�����
		return num + multRecursively(num, times - 1);
	}
	// ���������� �����, ����� ����� ����� �� ������ ������
	static long powerRecursively(long num, long power) {
		// ���� �� ���������� // �� ������� 0 � 1 ����� ��������
		if (power == 0) {
			return 1;
		}
		if (power == 1) {
			return num;
		}
		// � ���������� ������ ������ ������, �� �� ��������		// ������� �������� �� ������ � 1 ��-����� 		// � ���������� ������� �� ���� ��������
		return multRecursively(powerRecursively(num, power - 1), num);
	}
	
	public static void main(String[] args) {
		System.out.println(powerRecursively(3, 3));
	}
}
