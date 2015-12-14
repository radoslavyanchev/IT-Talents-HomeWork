import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Value ");
		int firstValue = sc.nextInt();
		
		System.out.println("Enter Second Value ");
		int secondValue = sc.nextInt();
		System.out.println("First value is " + firstValue + "\nSecond value is " + secondValue);
		System.out.println("SWAP");
		int swap = firstValue;
		
		firstValue = secondValue;
		
		secondValue = swap;
		
		System.out.println("New first value is " + firstValue + "\nNew second value is " + secondValue);
		sc.close();
	}

}
