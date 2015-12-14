import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleace enter number A\n");
		double a = sc.nextDouble();
		System.out.println("Pleace enter number B\n");
		double b = sc.nextDouble();
		System.out.println("Pleace enter number C\n");
		double c = sc.nextDouble();
		
		if((a<c)&&(c<b)&&(a<b)){
			System.out.println("C is between A & B1");
		} 
		else if((a>c)&&(c>b)&&(a>b)){
			System.out.println("C is between A & B2");
		}
		else{
			System.out.println("C is not between A & B");
		}
	}

}
