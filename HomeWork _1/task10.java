import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Numbers between 10 and 9999.");
		int liters = sc.nextInt();
		int sumBuckets = 5;
		int usedBuckets = liters / sumBuckets;

		
		System.out.println("2 liters backets " + usedBuckets + " times.");
		System.out.println("3 liters backets " + usedBuckets + " times.");
		
		if(liters % sumBuckets == 2){
			System.out.println("Another bucket of 2 liters");
		}
		if(liters % sumBuckets == 3){
			System.out.println("Another bucket of 3 liters");
		}
		if(liters % sumBuckets == 1){
			System.out.println("Another bucket of 2 liters");
		}

	}

}
