
public class Task14ForStrings {
	static int factorial(int n) {
		if (n < 0) {
			System.out.print("Числото е отрицателно : ");
			return n;
		}
		if (n == 0) {
			return 1;
		}

		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		// Да се състави метод, който приема за стойност число N и връща
		// стойността на N! (N факториел).
		int b = factorial(-5);
		System.out.println(b);
	}

}
