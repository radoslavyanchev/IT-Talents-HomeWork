import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleace enter Int numbers ");
		System.out.println("Pleace enter number A\n");
		int firstValue = sc.nextInt();
		
		System.out.println("Pleace enter number B\n");
		int secondValue = sc.nextInt();
		
		int sum = firstValue + secondValue;
		int difference = firstValue - secondValue;
		int product = firstValue * secondValue;
		int residue = firstValue % secondValue;
		int division = firstValue / secondValue;
		System.out.println("Sum is " + sum 
				+ "\nDifference is " + difference 
				+ "\nProduct is " + product 
				+ "\nResidue is " + residue
				+ "\nDivision is " + division);
		
		System.out.println("\n\nPleace enter Double numbers ");
		System.out.println("Pleace enter number A\n");
		double firstValueD = sc.nextDouble();
		
		System.out.println("Pleace enter number B\n");
		double secondValueD = sc.nextDouble();
		
		double sumD = firstValueD + secondValueD;
		double differenceD = firstValueD - secondValueD;
		double productD = firstValueD * secondValueD;
		double residueD = firstValueD % secondValueD;
		double divisionD = firstValueD / secondValueD;
		System.out.println("Sum is " + sumD 
				+ "\nDifference is " + differenceD 
				+ "\nProduct is " + productD 
				+ "\nResidue is " + residueD
				+ "\nDivision is " + divisionD);
	}

}
