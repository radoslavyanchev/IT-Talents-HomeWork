public class ChisloNaStepen {
	// рекурсивен метод,който умножава едно число по друго
	// или с други думи - събира го със себе си, даден брой пъти
	
	static long multRecursively(long num, long times) {
		// проверки за дъно на рекурсията // 0 по всяко число е 0 // и всяко число умножено по 1 // дава себе си
		if (num == 0 || times == 0) {
			return 0;
		}
		if (times == 1) {
			return num;
		}
		// иначе събираме това число с резултата от // метода, но този път с един път по-малко
		return num + multRecursively(num, times - 1);
	}
	// рекурсивен метод, който вдига число на дадена степен
	static long powerRecursively(long num, long power) {
		// дъно на рекурсията // за степени 0 и 1 знаем отговора
		if (power == 0) {
			return 1;
		}
		if (power == 1) {
			return num;
		}
		// в останалите случаи викаме метода, за да пресметн		// числото вдигнато на степен с 1 по-малка 		// и умножаваме числото по този резултат
		return multRecursively(powerRecursively(num, power - 1), num);
	}
	
	public static void main(String[] args) {
		System.out.println(powerRecursively(3, 3));
	}
}
