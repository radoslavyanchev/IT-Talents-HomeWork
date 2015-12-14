import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		//This program will show you how 5225 will be converted to A=55 and B=22.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number between 1000 and 9999");
		int number = sc.nextInt();
		
		int firstLastNumber = 0;
		int secondThirdNumber = 0;
		
		firstLastNumber = number%10;
		
		number = number/10;
		secondThirdNumber = number%10;
		
		
		number = number/10;
		secondThirdNumber = (number%10)*10 + secondThirdNumber;
	
		number = number/10;
		firstLastNumber= (number * 10) + firstLastNumber;
		
		System.out.println(firstLastNumber  + " , " + secondThirdNumber);
		
		if(firstLastNumber > secondThirdNumber){
			System.out.println("The first number is greater.");
		}
		if(firstLastNumber < secondThirdNumber){
			System.out.println("The first number is less.");
		}
		else{
			System.out.println("The are equal.");
		}
		
	}

}
