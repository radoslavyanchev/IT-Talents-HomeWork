import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Numbers between 10 and 99.\nEnter first Number:");
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter second Number:");
		int secondNumber = sc.nextInt();
		
		int product = firstNumber * secondNumber;
		
		System.out.print(product + ", " + product%10);
		
		if(((product%10) % 2) == 0){
			System.out.print(" " + "is even");
		}
		else{
			System.out.print(" " + "is odd");
		}
		
	}

}
