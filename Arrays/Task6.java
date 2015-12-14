
public class Task6 {

	public static void main(String[] args) {
		// Напишете програма, която първо чете 2 масива и после извежда
		// съобщение дали са еднакви, и дали са с еднакъв размер.

		int[] arrayFirst = { 10, 3, 5, 8, 6, -3, 7 };
		int[] arraySecond = { 10, 3, 5, 8, 6, -3,8};
		boolean flag = true;
		if (arrayFirst.length != arraySecond.length) {
			System.out.println("Масивите са с различни дължини.Не са еднакви");
		} 
		else {
			System.out.println("масивите са с еднаква дължина");
			for (int index = 0; index <= arrayFirst.length - 1; index++) {
				if (arrayFirst[index] != arraySecond[index]) {
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("Масивите са еднакви");
			}
			else{
				System.out.println("Но не са еднакви");
			}
		}
		
		
	}

}
