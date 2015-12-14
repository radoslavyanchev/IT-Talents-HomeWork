
public class Fibonachi {
	public static long fib(int n) {
		if (n <= 2)
			return 1;

		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		// int n =1;
		// int m =1;
		// int p =10;
		// System.out.print(n + ", ");
		// System.out.print(m + ", ");
		// for (int i = 0; i <p-2 ; i++) {
		// int sum=n+m;
		// System.out.print(sum + ", ");
		// n=m;
		// m=sum;
		// }
		// long z =fib(10);
		// System.out.println(z);
		//// PRINTIRANE NA TEKST V FRAME OT *
		// String[] words = { "Hello", "World", "in", "a", "frame" };
		// int max = 0;
		// for (int i = 0; i < words.length; i++) {
		// if (words[i].length() > max) {
		// max = words[i].length();
		// }
		// }
		// for (int i = 0; i <= max + 1; i++) {
		// System.out.print("*");
		// }
		//
		// System.out.println();
		// for (int i = 0; i < words.length; i++) {
		// System.out.print("*");
		// System.out.print(words[i]);
		// if (words[i].length() < max - 1) {
		// for (int j = 0; j <= max - 1 - words[i].length(); j++) {
		// System.out.print(" ");
		// }
		// }
		// System.out.print("*");
		// System.out.println();
		// }
		//
		// for (int i = 0; i <= max + 1; i++) {
		// System.out.print("*");
		// }

		// int n = 125;
		//
		// if(n==0 || n==1){
		// System.out.println("числото е кубично");
		// }else{
		// for (int i = 0; i < n/2; i++) {
		// if(i*i*i ==n){
		// System.out.println(" кубично е числото е " + i );
		// break;
		// }
		// else{
		// if(i*i*i >n){
		// System.out.println("ne e kubichno");
		// break;
		// }
		// }
		// }
		// }
//		int count = 0;
//		int balance = 10;
//		while (balance >= 1) {
//			count++;
//			System.out.println(count);
//			if (balance < 9) {
//				continue;
//			}
//			balance = balance - 9;
//			
//		}
//		System.out.println(count);
		
		
		int[] a = {10,22,43,64,21};
		for (int i = 4; i >=0; i--) {
//			System.out.println(a[i]);
			if(a[i]>21){
//				System.out.println(a[i]);
				a[i]=((a[i]+1)%(i+1));
				i++;
			}
			else{
				a[i]=a[i]*2;
				i--;
			}
			if(i>=0){
				System.out.println(a[i]);
			}
		}
	}

}
